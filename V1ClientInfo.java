/* Project: Project Milestone 2: GUI
* Class: ClientInfo.java
* Author: Yanelis
* Date: September 30th, 2022
* This class will ask the user to input thier information such as first name, last name, email, and phone number.
The confirm button will demonstrate the information to the user and you can change it as many times needed until you click add user.
This class will generate an ID for the user once they click add user.

*/ 
//Edited by Santiago Bejarano to include file printing as initial storage of Client Information
import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class V1ClientInfo extends javax.swing.JFrame {
	
	 //create new file where info will be stored 
	File clientFile = new File("SavedInfo\\ClientInfo.txt");
	
	public static JPanel clientPanel = new JPanel();
	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_HEIGHT = 400;
	   
	   private JLabel fNameLabel, lNameLabel, resultFName, resultLName,
	   resultEmail, phoneNumLabel, emailLabel, resultPhoneN, resultID, IDlabel, instructions, 
		jobLabel, jobResult, jobDlabel, jobDresult;
	   private JTextField fNameField, lNameField, emailField, phoneNumField, jobField, jobDfield;
	   private JButton buttonConfirmInfo, buttonAddUser, buttonBack; 

	   private static String fName ="";
	   private static String lName = ""; 
	   private static String phoneN =""; 
	   private static String email = "";
	   private static String clientID = ""; 
	   
	   public static String getfName() {
			return fName;}

		public static void setfName(String fName) {
			V1ClientInfo.fName = fName;}

		public static String getlName() {
			return lName;}

		public static void setlName(String lName) {
			V1ClientInfo.lName = lName;}

		public static String getPhoneN() {
			return phoneN;}

		public static void setPhoneN(String phoneN) {
			V1ClientInfo.phoneN = phoneN;}

		public static String getEmail() {
			return email;}

		public static void setEmail(String Email) {
			V1ClientInfo.email = Email;}

public static String getClientID() {
			return clientID;
		}

		public static void setClientID(String clientID) {
			V1ClientInfo.clientID = clientID;
		}

		//constructor
		public V1ClientInfo(String firstN, String lastN, String phoneNum, String emailAddress){
			firstN = fName; 
			lastN = lName; 
			phoneNum = phoneN; 
			emailAddress = email; 
		}
		
	   public V1ClientInfo() {
	   instructions = new JLabel("<html>Welcome to Client Registration.</html>");
	   instructions.setBounds(10, 10, 620, 35);
	   resultFName = new JLabel();
	   resultLName = new JLabel();
	   resultEmail = new JLabel();
	   resultPhoneN = new JLabel();
	   resultID = new JLabel();
	   jobResult = new JLabel();
	   jobDresult = new JLabel();
	   IDlabel = new JLabel("Client ID:"); 
	   IDlabel.setBounds(220, 275, 130, 25);
	
	   		
	      createTxtFieldFName();
	      createTxtFieldLName();
	      createTxtPhoneN();
	      createTxtEmail();
		createTxtJob();
	      createTxtJobD();
	      createButtonConfirmInfo();
	      createButtonAddUser();
	      createButtonBack();
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

//Create Text Box for Email 
	   private void createTxtEmail(){
		      emailLabel = new JLabel("Email: ");
		      final int FIELD_WIDTH = 15;
		      emailField = new JTextField(FIELD_WIDTH);
		      emailLabel.setBounds(10, 170, 105, 25);
		      emailField.setBounds(115, 170, 155, 25);}
	   
//Create Text Box for Phone Num
	   private void createTxtPhoneN(){
		      phoneNumLabel = new JLabel("Phone Number: ");
		      final int FIELD_WIDTH = 10;
		      phoneNumField = new JTextField(FIELD_WIDTH);
		      phoneNumLabel.setBounds(10, 130, 105, 25);
		      phoneNumField.setBounds(115, 130, 155, 25);}
 //Create Text Box for Job 
	   private void createTxtJob(){
		      jobLabel = new JLabel("Job: ");
		      final int FIELD_WIDTH = 15;
		      jobField = new JTextField(FIELD_WIDTH);
		      jobLabel.setBounds(10, 210, 105, 25);
		      jobField.setBounds(115, 210, 155, 25);}
	   
	   //Create Text Box for Job Duration
	   private void createTxtJobD(){
		      jobDlabel = new JLabel("Job Duration: ");
		      final int FIELD_WIDTH = 15;
		      jobDfield = new JTextField(FIELD_WIDTH);
		      jobDlabel.setBounds(10, 250, 105, 25);
		      jobDfield.setBounds(115, 250, 155, 25);}
	   
	   public String generateClientID() {
		   	Random random = new Random();
	        int num = random.nextInt(100000);
	        String formatted = String.format("%05d", num);
		return formatted; }

//Create Button 
	   private void createButtonConfirmInfo() {
	      buttonConfirmInfo= new JButton("Confirm Info");
	      
	      ActionListener listener = new ConfirmInfoListener();
	      buttonConfirmInfo.addActionListener(listener);
	      buttonConfirmInfo.setBounds(10, 290, 110, 25);}
	   
//implement results
	   public class ConfirmInfoListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				String fN = fNameField.getText();
				String lN = lNameField.getText();
				String phoneN = phoneNumField.getText();
				String email = emailField.getText();
				String job = jobField.getText();
				String jobD = jobDfield.getText();
						
			    resultFName.setText(fN);
			    resultFName.setBounds(275, 50, 130, 25);
			    resultLName.setText(lN);
			    resultLName.setBounds(275, 90, 130, 25);
			    resultPhoneN.setText(phoneN);
			    resultPhoneN.setBounds(275, 130, 130, 25);
			    resultEmail.setText(email);
			    resultEmail.setBounds(275, 170, 160, 25);
			 jobResult.setText(job);
			    jobResult.setBounds(275, 200, 160, 25);
			    jobDresult.setText(jobD);
			    jobDresult.setBounds(275, 240, 160, 25);}    
			 
			 }
	   
//Create Button 
	   private void createButtonAddUser() {
	      buttonAddUser= new JButton("Add User");
	      
	      ActionListener listener = new AddUserListener();
	      buttonAddUser.addActionListener(listener);
	      buttonAddUser.setBounds(10, 320, 100, 25);}
	   
//implement results
	   public class AddUserListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				 	String fN = fNameField.getText();
					String lN = lNameField.getText();
					String phoneN = phoneNumField.getText();
					String email = emailField.getText();
					String job = jobField.getText();
					String jobD = jobDfield.getText();
				 String clientID = generateClientID(); 
					
					resultID.setText(clientID);
					resultID.setBounds(280, 275, 130, 25);
				 
		//-------------------------------------------------------------------------------------------------------
		//This portion of the code creates and implements a file printer that stores client information in a file	
					clientFile.getParentFile().mkdirs(); //use getParentFile().mkdirs() to have location where file is stored created automatically
					//if it does not exist
					

				try{ //catch exception when printing into file
					PrintWriter fileWriter = new PrintWriter(new FileWriter (clientFile, true)); //create writer

					fileWriter.println("Name: "+fN+" "+lN); //get information inputed into program and print into file
					fileWriter.println("Phone number: "+phoneN);
					fileWriter.println("Email: "+email);
					fileWriter.println("Job: "+ job);
					fileWriter.println("Job Duration: "+ jobD);
					fileWriter.println("ClientID: " + clientID);
					fileWriter.flush();
					fileWriter.close(); //flush and close writer
					System.out.println("Client information saved"); //print into console when info was saved into file

				} catch (IOException e) {
					e.printStackTrace();
				}}
			}

	 //back button 
	   private void createButtonBack() {
		   buttonBack = new JButton("Back");
		   ActionListener listener = new BackListener();
		   buttonBack.addActionListener(listener);
		   buttonBack.setBounds(300, 310, 100, 25);
		   }
	   
	   public class BackListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				 JComponent comp = (JComponent) event.getSource();
				  Window win = SwingUtilities.getWindowAncestor(comp);
				  win.dispose();
				 new WelcomePage();
			 }}
	   
//create a panel
	   private void createPanel(){
	      clientPanel.setLayout(null);
	      clientPanel.add(fNameLabel);
	      clientPanel.add(fNameField);
	      clientPanel.add(lNameLabel);
	      clientPanel.add(lNameField);
	      clientPanel.add(emailLabel);
	      clientPanel.add(emailField);
	      clientPanel.add(phoneNumLabel);
	      clientPanel.add(phoneNumField);
		 clientPanel.add(jobField);
	      clientPanel.add(jobLabel);
	      clientPanel.add(jobDfield);
	      clientPanel.add(jobDlabel);
	      clientPanel.add(IDlabel);
	      clientPanel.add(buttonConfirmInfo);
	      clientPanel.add(buttonAddUser);
	      clientPanel.add(buttonBack);
	      clientPanel.add(resultFName); 
	      clientPanel.add(resultLName);
	      clientPanel.add(resultEmail);
	      clientPanel.add(resultPhoneN);
	      clientPanel.add(resultID);
		clientPanel.add(jobResult);
	      clientPanel.add(jobDresult);
	      clientPanel.add(instructions);
		clientPanel.setBackground(new Color(0xffe9f8));
	      clientPanel.setVisible(true);
	
	
	      // adds to current object
	      add(clientPanel);} 
	   
	   public static void main(String[] args) {
		   java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new V1ClientInfo();
	                }
	
	   });
}
}
