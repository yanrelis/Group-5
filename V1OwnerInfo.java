import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class V1OwnerInfo extends JFrame {
	private static final int FRAME_WIDTH = 600;
	   private static final int FRAME_HEIGHT = 500;
	   
	   private JLabel fNameLabel;
	   private JTextField fNameField;
	   private JLabel lNameLabel;
	   private JTextField lNameField;
	   private JLabel lNumLabel;
	   private JTextField lNumField;
	   private JButton buttonAddUser;
	   private JLabel resultName;	
	   private JLabel emailLabel;
	   private JTextField emailField;
	   private JLabel resultEmail;
	   private JLabel phoneNumLabel;
	   private JTextField phoneNumField;
	   private JLabel resultPhoneN;
	   private JLabel resultLicenseN;
	   private JButton buttonLicense;

	   private static String fName ="";
	   private static String lName = ""; 
	   private static String email = ""; 
	   private static String licenseNum = ""; 
	   private static String phoneNum= ""; 
	   
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

//constructor
// *MISSING OWNERID*
	   public V1OwnerInfo() {
	   resultName = new JLabel();
	   resultEmail = new JLabel();
	   resultPhoneN = new JLabel();
	   resultLicenseN = new JLabel();
	   	  
	   	  createTxtFieldFName();
	      createTxtFieldLName();
	      createTxtPhoneN();
	      createTxtEmail();
	      createTxtLicenseN();
	      createButtonAddUser();
	      createPanel();

	      setSize(FRAME_WIDTH, FRAME_HEIGHT);
	   }
	   
//Create Text Box for First Name
	   private void createTxtFieldFName(){
	      fNameLabel = new JLabel("First Name: ");
	      final int FIELD_WIDTH = 10;
	      fNameField = new JTextField(FIELD_WIDTH);} 

//Create Text Box for Last Name
	   private void createTxtFieldLName(){
		      lNameLabel = new JLabel("Last Name: ");
		      final int FIELD_WIDTH = 10;
		      lNameField = new JTextField(FIELD_WIDTH);} 
//Create Text Box for Phone Num 
	   private void createTxtPhoneN(){
		      phoneNumLabel = new JLabel("Phone Number: ");
		      final int FIELD_WIDTH = 15;
		      phoneNumField = new JTextField(FIELD_WIDTH);}
	   
//Create Text Box for Email
	   private void createTxtEmail(){
		      emailLabel = new JLabel("Email: ");
		      final int FIELD_WIDTH = 15;
		      emailField = new JTextField(FIELD_WIDTH);}
	   
//Create Text Box for LicenseNum 
	   private void createTxtLicenseN(){
		      lNumLabel = new JLabel("License Num: ");
		      final int FIELD_WIDTH = 10;
		      lNumField = new JTextField(FIELD_WIDTH);}

//Create Button 
	   private void createButtonAddUser() {
	      buttonAddUser = new JButton("ADD USER");
	      
	      ActionListener listener = new AddUserListener();
	      buttonAddUser.addActionListener(listener);}
	   
//implement results
	   public class AddUserListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				String fN = fNameField.getText();
				String lN = lNameField.getText();
				String phoneN = phoneNumField.getText();
				String email = emailField.getText();
				String lNum = lNumField.getText();
						
			    resultName.setText("Name:" + fN + " " + lN);
			    resultPhoneN.setText("Phone Number: " + phoneN);
			    resultEmail.setText("Email: " + email);
			    resultLicenseN.setText("License Number: " + lNum);}
			 }
	   
	   
//create a panel
	   private void createPanel(){
	      JPanel panel = new JPanel();
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
	      panel.add(buttonAddUser);
	      panel.add(resultName); 
	      panel.add(resultPhoneN);
	      panel.add(resultEmail);
	      panel.add(resultLicenseN);
	
	      // adds to current object
	      add(panel);} 
	   
	

}
