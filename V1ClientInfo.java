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
	   private JLabel EmailLabel;
	   private JTextField EmailField;
	   private JButton buttonCN;
	   private JLabel resultName;	
	   private JLabel resultEmail;
	   private JButton buttonEmail;

	   private static String fName ="";
	   private static String lName = ""; 
	   private static LocalDate Dob = LocalDate.of(2000,1,02);; 
	   private static String email = ""; 
	   
	   public static String getfName() {
			return fName;}

		public static void setfName(String fName) {
			V1ClientInfo.fName = fName;}

		public static String getlName() {
			return lName;}

		public static void setlName(String lName) {
			V1ClientInfo.lName = lName;}

		public static LocalDate getDob() {
			return Dob;}

		public static void setDob(LocalDate dob) {
			Dob = dob;}

		public static String getEmail() {
			return email;}

		public static void setLicenseNum(String Email) {
			Email= email;}

//constructor
// *MISSING OWNERID*
	   public V1ClientInfo() {
	   resultName = new JLabel();
	   resultEmail = new JLabel();
	   
	      createTxtFieldFName();
	      createTxtFieldLName();
	      createTxtEmail();
	      createButtonCN();
	      createButtonEmail();
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

//Create Text Box for LicenseNum 
	   private void createTxtEmail(){
		      EmailLabel = new JLabel("Email: ");
		      final int FIELD_WIDTH = 15;
		      EmailField = new JTextField(FIELD_WIDTH);}

//Create Button 
	   private void createButtonCN() {
	      buttonCN = new JButton("Confirm Name");
	      
	      ActionListener listener = new AddNameListener();
	      buttonCN.addActionListener(listener);}
	   
//implement results
	   public class AddNameListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				String fN = fNameField.getText();
				String lN = lNameField.getText();
						
			    resultName.setText("Full Name:" + fN + " " + lN);}    
			 }
	   
//Create Button Email
	   private void createButtonEmail() {
		      buttonEmail = new JButton("Confirm Email");
		      
		      ActionListener listener = new AddEmailListener();
		      buttonEmail.addActionListener(listener);}

	   public class AddEmailListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				String email = EmailField.getText();
			
			    resultEmail.setText("Email: " + email);}    
			 }
	   
//create a panel
	   private void createPanel(){
	      JPanel panel = new JPanel();
	      panel.add(fNameLabel);
	      panel.add(fNameField);
	      panel.add(lNameLabel);
	      panel.add(lNameField);
	      panel.add(EmailLabel);
	      panel.add(EmailField);
	      panel.add(buttonCN);
	      panel.add(buttonEmail);
	      panel.add(resultName); 
	      panel.add(resultEmail);
	
	      // adds to current object
	      add(panel);} 
	   
	

}
