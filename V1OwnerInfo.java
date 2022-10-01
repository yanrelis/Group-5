import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.*; 


public class V1OwnerInfo extends JFrame {
	   private static final int FRAME_WIDTH = 600;
	   private static final int FRAME_HEIGHT = 500;
	   
	   private JLabel fNameLabel;
	   private JTextField fNameField;
	   private JLabel lNameLabel;
	   private JTextField lNameField;
	   private JLabel lNumLabel;
	   private JTextField lNumField;
	   private JButton buttonConfirmInfo;
	   private JLabel resultName;	
	   private JLabel emailLabel;
	   private JTextField emailField;
	   private JLabel resultEmail;
	   private JLabel phoneNumLabel;
	   private JTextField phoneNumField;
	   private JLabel resultPhoneN;
	   private JLabel resultLicenseN;
	   private JButton buttonAddUser;

	   private static String fName ="";
	   private static String lName = ""; 
	   private static String email = ""; 
	   private static String licenseNum = ""; 
	   private static String phoneNum= ""; 
	   
	   private static ArrayList<V1OwnerInfo> ownerInfo;
	   
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
		public V1OwnerInfo(String firstN, String lastN, String phoneN, String emailAddress, String licenseN){
			firstN = fName; 
			lastN = lName; 
			phoneN = phoneNum; 
			emailAddress = email; 
			licenseN = licenseNum;
		}
		
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
	      createButtonConfirmInfo();
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
		      lNumLabel = new JLabel("License Number: ");
		      final int FIELD_WIDTH = 10;
		      lNumField = new JTextField(FIELD_WIDTH);}

//Create Button to Confirm Info
	   private void createButtonConfirmInfo() {
	      buttonConfirmInfo = new JButton("Confirm Info");
	      
	      ActionListener listener = new ConfirmInfoListener();
	      buttonConfirmInfo.addActionListener(listener);}
	   
//implement results
	   public class ConfirmInfoListener implements ActionListener {
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
	   
//Button Needed to Add Car  
	   
	   
	   
//Create Button to Add User
	   private void createButtonAddUser() {
	      buttonAddUser = new JButton("Add User");
	      
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

//Is an arrayList necessary to print out to file???
					V1OwnerInfo user = new V1OwnerInfo(fN,lN, phoneN, email, lNum);
					ownerInfo = new ArrayList<V1OwnerInfo>();
					ownerInfo.add(user);}
	   		}
	   
/* Tester
 * for (int i=0; i<ownerInfo.size(); i++) {
 * System.out.println(ownerInfo.get(i));}
 * prints out array but needs to be converted toString()*/
	   
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
	      panel.add(buttonConfirmInfo);
	      panel.add(buttonAddUser);
	      panel.add(resultName); 
	      panel.add(resultPhoneN);
	      panel.add(resultEmail);
	      panel.add(resultLicenseN);

	      // adds to current object
	      add(panel);} 
	   
	

}

