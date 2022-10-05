/* Project: Project Milestone 2: GUI
* Class: V1OwnerInfo.java
* Author: Katherine Dumancela
* Date: September 29st, 2022
* This class is used to create objects pertaining to each individual vehicle and stores the
* VIN numbers, the year the vehicle was made, the makes and models of each vehicle, the color
* of the vehicle, the length of time the vehicle is available, and any notes an inspector may
* have regarding damage present on the vehicle. This class also contains a method that returns
* all of the information recorded about the specified vehicle in a few sentences.
*/ 
import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.util.*; 
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class V1OwnerInfo extends javax.swing.JFrame {

	//	   
	   File ownerFile = new File("SavedInfo\\OwnerInfo.txt");  //create new file where info will be stored 
	   
//---------------------------------------------------------------------
	//
	   public static JPanel ownerPanel = new JPanel();
	   private JLabel fNameLabel, lNameLabel, lNumLabel, resultFName, resultLName,
	   resultEmail, phoneNumLabel, emailLabel, resultPhoneN, resultLicenseN, resultID, IDlabel, instructions;
	   private JTextField fNameField, lNameField, lNumField, emailField, phoneNumField;
	   private JButton buttonConfirmInfo, buttonAddUser, buttonAddCar, buttonBack; 

	   private static final int FRAME_WIDTH = 600;
	   private static final int FRAME_HEIGHT = 400;
	  
	   private static String fName ="";
	   private static String lName = ""; 
	   private static String email = ""; 
	   private static String licenseNum = ""; 
	   private static String phoneNum= ""; 
	   private static String ownerID = "";
	   
 //---------------------------------------------------------------------
	//   
	   public static String getfName() {
			return fName;}

		public static void setfName(String fName) {
			V1OwnerInfo.fName = fName;}

		public static String getlName() {
			return lName;}

		public static void setlName(String lName) {
			V1OwnerInfo.lName = lName;}

		public static String getEmail() {
			return email;}

		public static void setEmail(String Email) {
			Email= email;}

		public static String getLicenseNum() {
			return licenseNum;}

		public static void setLicenseNum(String LicenseNum) {
			LicenseNum = licenseNum;}
		
		 public static String getPhoneNum() {
				return phoneNum;}

		public static void setPhoneNum(String phoneNum) {
				V1OwnerInfo.phoneNum = phoneNum;}
		
		public static String getOwnerID() {
			return ownerID;
		}

		public static void setOwnerID(String ownerID) {
			V1OwnerInfo.ownerID = ownerID;
		}

//---------------------------------------------------------------------
	//CONSTRUCTOR	
		public V1OwnerInfo(String firstN, String lastN, String phoneN, String emailAddress, String licenseN){
			firstN = fName; 
			lastN = lName; 
			phoneN = phoneNum; 
			emailAddress = email; 
			licenseN = licenseNum;
		}
		
//---------------------------------------------------------------------
	//generate final panel with all the JLabels/TxtFields/Buttons
	   public V1OwnerInfo() {
		   instructions = new JLabel("<html>Welcome to Owner Registration. </html>");
		   instructions.setBounds(10, 10, 620, 35);
	   resultFName = new JLabel();
	   resultLName = new JLabel();
	   resultEmail = new JLabel();
	   resultPhoneN = new JLabel();
	   resultLicenseN = new JLabel();
	   resultID = new JLabel();
	   IDlabel = new JLabel("Owner ID: "); 
	   IDlabel.setBounds(220, 250, 130, 25);
	   	  
	   	  createTxtFieldFName();
	      createTxtFieldLName();
	      createTxtPhoneN();
	      createTxtEmail();
	      createTxtLicenseN();
	      createButtonConfirmInfo();
	      createButtonAddCar();
	      createButtonAddUser();
	      createButtonBack();
	      createPanel();

	      setSize(FRAME_WIDTH, FRAME_HEIGHT);
	   }

//---------------------------------------------------------
	   //Create Text Box for First Name
	   private void createTxtFieldFName(){
	      fNameLabel = new JLabel("First Name: ");
	      final int FIELD_WIDTH = 10;
	      fNameField = new JTextField(FIELD_WIDTH);
	      fNameLabel.setBounds(10, 50, 105, 25);
	      fNameField.setBounds(115, 50, 155, 25);} 
	   
//---------------------------------------------------------
//Create Text Box for Last Name
	   private void createTxtFieldLName(){
		      lNameLabel = new JLabel("Last Name: ");
		      final int FIELD_WIDTH = 10;
		      lNameField = new JTextField(FIELD_WIDTH);
		      lNameLabel.setBounds(10, 90, 105, 25);
		      lNameField.setBounds(115, 90, 155, 25);} 

//---------------------------------------------------------
//Create Text Box for Phone Num 
	   private void createTxtPhoneN(){
		      phoneNumLabel = new JLabel("Phone Number: ");
		      final int FIELD_WIDTH = 15;
		      phoneNumField = new JTextField(FIELD_WIDTH);
		      phoneNumLabel.setBounds(10, 130, 105, 25);
		      phoneNumField.setBounds(115, 130, 155, 25);}

//---------------------------------------------------------
	   //Create Text Box for Email
	   private void createTxtEmail(){
		      emailLabel = new JLabel("Email: ");
		      final int FIELD_WIDTH = 15;
		      emailField = new JTextField(FIELD_WIDTH);
		      emailLabel.setBounds(10, 170, 105, 25);
		      emailField.setBounds(115, 170, 155, 25);}

//---------------------------------------------------------
	   //Create Text Box for LicenseNum 
	   private void createTxtLicenseN(){
		      lNumLabel = new JLabel("License Number: ");
		      final int FIELD_WIDTH = 10;
		      lNumField = new JTextField(FIELD_WIDTH);
		      lNumLabel.setBounds(10, 210, 105, 25);
		      lNumField.setBounds(115, 210, 155, 25);}
	   
	   public String generateOwnerID() {
		   	Random random = new Random();
	        int num = random.nextInt(100000);
	        String formatted = String.format("%06d", num);
		return formatted; }

//---------------------------------------------------------
	   //Create Button to Confirm Info
	   private void createButtonConfirmInfo() {
	      buttonConfirmInfo = new JButton("Confirm Info");
	      
	      ActionListener listener = new ConfirmInfoListener();
	      buttonConfirmInfo.addActionListener(listener);
	      buttonConfirmInfo.setBounds(10, 250, 110, 25);}
	   
//---------------------------------------------------------
	   //implement results on confirm info allows users to make changes in case they make a mistake
	   public class ConfirmInfoListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				String fN = fNameField.getText();
				String lN = lNameField.getText();
				String phoneN = phoneNumField.getText();
				String email = emailField.getText();
				String lNum = lNumField.getText();
						
				resultFName.setText(fN);
			    resultFName.setBounds(275, 50, 130, 25);
			    resultLName.setText(lN);
			    resultLName.setBounds(275, 90, 130, 25);
			    resultPhoneN.setText(phoneN);
			    resultPhoneN.setBounds(275, 130, 130, 25);
			    resultEmail.setText(email);
			    resultEmail.setBounds(275, 170, 130, 25);
			    resultLicenseN.setText(lNum);
			    resultLicenseN.setBounds(275, 210, 160, 25);}
			 }

//---------------------------------------------------------
	   //Create Button to Add User
	   private void createButtonAddUser() {
	      buttonAddUser = new JButton("Add User");
	      
	      ActionListener listener = new AddUserListener();
	      buttonAddUser.addActionListener(listener);
	      buttonAddUser.setBounds(10, 310, 100, 25);}
	   
//---------------------------------------------------------   	
	   //implement results on AddUser Button
	   public class AddUserListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				 	String fN = fNameField.getText();
					String lN = lNameField.getText();
					String phoneN = phoneNumField.getText();
					String email = emailField.getText();
					String lNum = lNumField.getText();
					String ownerID = generateOwnerID();
					
					resultID.setText(ownerID);
					resultID.setBounds(280, 250, 130, 25);
					
					ownerFile.getParentFile().mkdirs(); //use getParentFile().mkdirs() to have location where file is stored created automatically
						//if it does not exist
					
					try{ //catch exception when printing into file
						PrintWriter fileWriter = new PrintWriter(new FileWriter (ownerFile, true)); //create writer
						
						
						fileWriter.println("Name: "+fN+" "+lN); //get information inputed into program and print into file
						fileWriter.println("Phone number: "+phoneN);
						fileWriter.println("Email: "+email);
						fileWriter.println("Licenseplate number: "+lNum);
						fileWriter.println("OwnerID: " + ownerID);
						fileWriter.flush();
						fileWriter.close(); //flush and close writer
						System.out.println("Owner information saved"); //print into console when info was saved into file

					} catch (IOException e) {
						e.printStackTrace();
					}
			 }}
	   
//---------------------------------------------------------
	   //AddCar button will lead to OwnerCarViewer  
	   private void createButtonAddCar() {
		   buttonAddCar = new JButton("Add Car");
		   ActionListener listener = new AddCarListener();
		   buttonAddCar.addActionListener(listener);
		   buttonAddCar.setBounds(335, 310, 100, 25);
		   }

	   //implement results on AddCar Button
	   public class AddCarListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				 JComponent comp = (JComponent) event.getSource();
				  Window win = SwingUtilities.getWindowAncestor(comp);
				  win.dispose();
				 new V1OwnerCarViewer();
			 }}
	   
//---------------------------------------------------------
	   //back button to get back to home page
	   private void createButtonBack() {
		   buttonBack = new JButton("Back");
		   ActionListener listener = new BackListener();
		   buttonBack.addActionListener(listener);
		   buttonBack.setBounds(335, 10, 100, 25);
		   }

	   //implement results on Back Button
	   public class BackListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				 JComponent comp = (JComponent) event.getSource();
				  Window win = SwingUtilities.getWindowAncestor(comp);
				  win.dispose();
				 //Welcome FRAME
				 new WelcomePage();
			 }}
	   
//---------------------------------------------------------------------	   
	   //create a panel method that will add all JLabels/JFields/JButtons to the panel
	   private void createPanel(){
	      JPanel panel = new JPanel();
	      panel.setLayout(null);
	      panel.add(fNameLabel);
	      panel.add(fNameField);
	      panel.add(lNameLabel);
	      panel.add(lNameField);
	      panel.add(phoneNumLabel);
	      panel.add(phoneNumField);
	      panel.add(emailLabel);
	      panel.add(emailField);
	      panel.add(lNumLabel);
	      panel.add(lNumField);
	      panel.add(buttonConfirmInfo);
	      panel.add(buttonAddUser);
	      panel.add(buttonAddCar);
	      panel.add(buttonBack);
	      panel.add(resultFName);
	      panel.add(resultLName);
	      panel.add(resultPhoneN);
	      panel.add(resultEmail);
	      panel.add(resultLicenseN);
	      panel.add(IDlabel);
	      panel.add(resultID);
	      panel.add(instructions);
	 panel.setBackground(new Color (0xfff8e9));

	      // adds to current object
	      add(panel);} 

//---------------------------------------------------------
	   //invoke and run panel created in V1OwnerInfo
	   public static void main(String[] args) {
		   java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new V1OwnerInfo();
	                } });
		      }
	   }

