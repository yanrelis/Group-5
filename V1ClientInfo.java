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


public class V1ClientInfo extends JFrame {
	private static final int FRAME_WIDTH = 600;
	   private static final int FRAME_HEIGHT = 500;
	   
	   private JLabel fNameLabel;
	   private JTextField fNameField;
	   private JLabel lNameLabel;
	   private JTextField lNameField;
	   private JLabel phoneNumLabel; 
	   private JTextField phoneNumField;
	   private JLabel emailLabel;
	   private JTextField emailField;
	   private JButton buttonAddUser;
	   private JLabel resultName;	
	   private JLabel resultEmail;
	   private JLabel resultPhoneN;

	   private static String fName ="";
	   private static String lName = ""; 
	   private static String phoneN =""; 
	   private static String email = ""; 
	   
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
			Email= email;}

//constructor
// *MISSING CLIENTID Generation*
	   public V1ClientInfo() {
	   resultName = new JLabel();
	   resultEmail = new JLabel();
	   resultPhoneN = new JLabel();
	   
	      createTxtFieldFName();
	      createTxtFieldLName();
	      createTxtPhoneN();
	      createTxtEmail();
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
		      lNameField = new JTextField(FIELD_WIDTH);
		      } 

//Create Text Box for Email 
	   private void createTxtEmail(){
		      emailLabel = new JLabel("Email: ");
		      final int FIELD_WIDTH = 15;
		      emailField = new JTextField(FIELD_WIDTH);}
	   
//Create Text Box for Phone Num
	   private void createTxtPhoneN(){
		      phoneNumLabel = new JLabel("Phone Number: ");
		      final int FIELD_WIDTH = 10;
		      phoneNumField = new JTextField(FIELD_WIDTH);}

//Create Button 
	   private void createButtonAddUser() {
	      buttonAddUser = new JButton("Confirm Information");
	      
	      ActionListener listener = new AddNameListener();
	      buttonAddUser.addActionListener(listener);}
	   
//implement results
	   public class AddNameListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				String fN = fNameField.getText();
				String lN = lNameField.getText();
				String phoneN = phoneNumField.getText();
				String email = emailField.getText();
						
			    resultName.setText("Name:" + fN + " " + lN);
			    resultPhoneN.setText("Phone Number: " + phoneN);
			    resultEmail.setText("Email: " + email);}    
			 }
	   
//create a panel
	   private void createPanel(){
	      JPanel panel = new JPanel();
	      panel.add(fNameLabel);
	      panel.add(fNameField);
	      panel.add(lNameLabel);
	      panel.add(lNameField);
	      panel.add(emailLabel);
	      panel.add(emailField);
	      panel.add(phoneNumLabel);
	      panel.add(phoneNumField);
	      panel.add(buttonAddUser);
	      panel.add(resultName); 
	      panel.add(resultEmail);
	      panel.add(resultPhoneN);
	
	      // adds to current object
	      add(panel);} 
	   
	

}
