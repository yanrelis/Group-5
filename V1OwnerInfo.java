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
	   private JButton buttonCN;
	   private JLabel resultName;	
	   private JLabel resultLicenseN;
	   private JButton buttonLicense;

	   private static String fName ="";
	   private static String lName = ""; 
	   private static LocalDate Dob = LocalDate.of(2000,1,02);; 
	   private static String LicenseNum = ""; 
	   
	   public static String getfName() {
			return fName;}

		public static void setfName(String fName) {
			V1OwnerInfo.fName = fName;}

		public static String getlName() {
			return lName;}

		public static void setlName(String lName) {
			V1OwnerInfo.lName = lName;}

		public static LocalDate getDob() {
			return Dob;}

		public static void setDob(LocalDate dob) {
			Dob = dob;}

		public static String getLicenseNum() {
			return LicenseNum;}

		public static void setLicenseNum(String licenseNum) {
			LicenseNum = licenseNum;}

//constructor
// *MISSING OWNERID*
	   public V1OwnerInfo() {
	   resultName = new JLabel();
	   resultLicenseN = new JLabel();
	   
	      createTxtFieldFName();
	      createTxtFieldLName();
	      createTxtLicenseN();
	      createButtonCN();
	      createButtonLicenseN();
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

//Create Text Box for LicenseNum 
	   private void createTxtLicenseN(){
		      lNumLabel = new JLabel("License Num: ");
		      final int FIELD_WIDTH = 10;
		      lNumField = new JTextField(FIELD_WIDTH);}

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
						
			    resultName.setText("Confirm Name:" + fN + " " + lN);}    
			 }
	   
//Create Button License Num
	   private void createButtonLicenseN() {
		      buttonLicense = new JButton("Confirm LicenseNum");
		      
		      ActionListener listener = new AddLicenseListener();
		      buttonLicense.addActionListener(listener);}

	   public class AddLicenseListener implements ActionListener {
			 public void actionPerformed(ActionEvent event){
				String lNum = lNumField.getText();
			
			    resultLicenseN.setText("Confirm License Num: " + lNum);}    
			 }
	   
//create a panel
	   private void createPanel(){
	      JPanel panel = new JPanel();
	      panel.add(fNameLabel);
	      panel.add(fNameField);
	      panel.add(lNameLabel);
	      panel.add(lNameField);
	      panel.add(lNumLabel);
	      panel.add(lNumField);
	      panel.add(buttonCN);
	      panel.add(buttonLicense);
	      panel.add(resultName); 
	      panel.add(resultLicenseN);
	
	      // adds to current object
	      add(panel);} 
	   
	

}
