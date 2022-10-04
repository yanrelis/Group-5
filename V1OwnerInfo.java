import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.*; 
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class V1OwnerInfo extends JFrame {
	   private static final int FRAME_WIDTH = 500;
	   private static final int FRAME_HEIGHT = 400;
	   
	   File ownerFile = new File("SavedInfo\\OwnerInfo.txt");  //create new file where info will be stored 
	   
	   private JLabel fNameLabel, lNameLabel, lNumLabel, resultFName, resultLName,
	   resultEmail, phoneNumLabel, emailLabel, resultPhoneN, resultLicenseN, resultID, IDlabel;
	   private JTextField fNameField, lNameField, lNumField, emailField, phoneNumField;
	   private JButton buttonConfirmInfo, buttonAddUser, buttonAddCar;

	   private static String fName ="";
	   private static String lName = ""; 
	   private static String email = ""; 
	   private static String licenseNum = ""; 
	   private static String phoneNum= ""; 
	   private static String ownerID = "";
	   
	   
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

		//constructor
		public V1OwnerInfo(String firstN, String lastN, String phoneN, String emailAddress, String licenseN){
			firstN = fName; 
			lastN = lName; 
			phoneN = phoneNum; 
			emailAddress = email; 
			licenseN = licenseNum;
		}
		
// *MISSING OWNERID*
	   public V1OwnerInfo() {
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
	      createPanel();

	      setSize(FRAME_WIDTH, FRAME_HEIGHT);
	   }
	   
//Create Text Box for First Name
	   private void createTxtFieldFName(){
	      fNameLabel = new JLabel("First Name: ");
	      final int FIELD_WIDTH = 10;
	      fNameField = new JTextField(FIELD_WIDTH);
	      fNameLabel.setBounds(10, 50, 105, 25);
	      fNameField.setBounds(115, 50, 155, 25);} 

//Create Text Box for Last Name
	   private void createTxtFieldLName(){
		      lNameLabel = new JLabel("Last Name: ");
		      final int FIELD_WIDTH = 10;
		      lNameField = new JTextField(FIELD_WIDTH);
		      lNameLabel.setBounds(10, 90, 105, 25);
		      lNameField.setBounds(115, 90, 155, 25);
			} 
//Create Text Box for Phone Num 
	   private void createTxtPhoneN(){
		      phoneNumLabel = new JLabel("Phone Number: ");
		      final int FIELD_WIDTH = 15;
		      phoneNumField = new JTextField(FIELD_WIDTH);
		      phoneNumLabel.setBounds(10, 130, 105, 25);
		      phoneNumField.setBounds(115, 130, 155, 25);}
	   
//Create Text Box for Email
	   private void createTxtEmail(){
		      emailLabel = new JLabel("Email: ");
		      final int FIELD_WIDTH = 15;
		      emailField = new JTextField(FIELD_WIDTH);
		      emailLabel.setBounds(10, 170, 105, 25);
		      emailField.setBounds(115, 170, 155, 25);}
	   
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

//Create Button to Confirm Info
	   private void createButtonConfirmInfo() {
	      buttonConfirmInfo = new JButton("Confirm Info");
	      
	      ActionListener listener = new ConfirmInfoListener();
	      buttonConfirmInfo.addActionListener(listener);
	      buttonConfirmInfo.setBounds(100, 310, 110, 25);}
	   
//implement results
	   public class ConfirmInfoListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				String fN = fNameField.getText();
				String lN = lNameField.getText();
				String phoneN = phoneNumField.getText();
				String email = emailField.getText();
				String lNum = lNumField.getText();
						
				resultFName.setText(fN);
			    resultFName.setBounds(280, 50, 130, 25);
			    resultLName.setText(lN);
			    resultLName.setBounds(280, 90, 130, 25);
			    resultPhoneN.setText(phoneN);
			    resultPhoneN.setBounds(280, 130, 130, 25);
			    resultEmail.setText(email);
			    resultEmail.setBounds(280, 170, 130, 25);
			    resultLicenseN.setText(lNum);
			    resultLicenseN.setBounds(280, 210, 130, 25);}
			 }
	    
//Create Button to Add User
	   private void createButtonAddUser() {
	      buttonAddUser = new JButton("Add User");
	      
	      ActionListener listener = new AddUserListener();
	      buttonAddUser.addActionListener(listener);
	      buttonAddUser.setBounds(220, 310, 100, 25);}
	   	
//implement results
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
//Button Needed to Add Car  
	   
	   private void createButtonAddCar() {
		   buttonAddCar = new JButton("Add Car");
		   ActionListener listener = new AddCarListener();
		   buttonAddCar.addActionListener(listener);
		   buttonAddCar.setBounds(335, 310, 100, 25);
		   }
	   
	   public class AddCarListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				 	//calls to Andrew's class Owner Car
			 }}
//create a panel
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
	      panel.add(resultFName);
	      panel.add(resultLName);
	      panel.add(resultPhoneN);
	      panel.add(resultEmail);
	      panel.add(resultLicenseN);
	      panel.add(IDlabel);
	      panel.add(resultID);

	      // adds to current object
	      add(panel);} 
	   
	   public static void main(String[] args) {
			JFrame frame = new V1OwnerInfo();
			
		      
		      //The setDefaultCloseOperation() method is used to specify one of several options for the close button. 

		      //JFrame.EXIT_ON_CLOSE — Exit the application.
		      //JFrame.HIDE_ON_CLOSE — Hide the frame, but keep the application running.
		      //JFrame.DISPOSE_ON_CLOSE — Dispose of the frame object, but keep the application running.
		      //JFrame.DO_NOTHING_ON_CLOSE — Ignore the click.

		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setVisible(true);
		   }
	

}

