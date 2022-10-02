/* Project: Project Milestone 2: GUI
* Class: V1OwnerCar.java
* Author: Andrew Vargas
* Date: October 2nd, 2022
* This class is used to create a GUI that allows the information about a specified vehicle to be entered and stored.
*/ 

import java.awt.event.*;
import javax.swing.*;

public class V1OwnerCarViewer implements ActionListener {
	
	private JFrame frame;
	private JPanel mainpanel;
	private JLabel instructions, vehicleVIN, vehicleYear, vehicleMake, vehicleModel, vehicleColor, vehicleAvailability, vehicleDamageNotes, savedMessage;
	private JTextField inVIN, inYear, inMake, inModel, inColor, inAvailability, inDamageNotes;
	private JButton saveButton;
	
	// --------------------------------------------------
	// This constructor creates the GUI that allows information about a specified vehicle to be entered and stored.
	public V1OwnerCarViewer()
	{
		frame = new JFrame();
		mainpanel = new JPanel();
		instructions = new JLabel("<html>Welcome to the Vehicle Viewer. Please enter all of the following information about a vehicle and click the store button once completed.</html>");
		vehicleVIN = new JLabel("Vehicle VIN");
		inVIN = new JTextField(10);
		vehicleYear = new JLabel("Vehicle Year");
		inYear = new JTextField(10);
		vehicleMake = new JLabel("Vehicle Make");
		inMake = new JTextField(10);
		vehicleModel = new JLabel("Vehicle Model");
		inModel = new JTextField(10);
		vehicleColor = new JLabel("Vehicle Color");
		inColor = new JTextField(10);
		vehicleAvailability = new JLabel("Availability");
		inAvailability = new JTextField(10);
		vehicleDamageNotes = new JLabel("Damage Notes");
		inDamageNotes = new JTextField(10);
		saveButton = new JButton("Store");
		savedMessage = new JLabel("");
		
		frame.setSize(640, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Vehicle Viewer");
		
		frame.add(mainpanel);
		mainpanel.setLayout(null);
		instructions.setBounds(10, 10, 620, 35);
		mainpanel.add(instructions);
		
		vehicleVIN.setBounds(10, 50, 100, 25);
		inVIN.setBounds(105, 50, 155, 25);
		mainpanel.add(vehicleVIN);
		mainpanel.add(inVIN);
		
		vehicleYear.setBounds(10, 90, 100, 25);
		inYear.setBounds(105, 90, 155, 25);
		mainpanel.add(vehicleYear);
		mainpanel.add(inYear);
		
		vehicleMake.setBounds(10, 130, 100, 25);
		inMake.setBounds(105, 130, 155, 25);
		mainpanel.add(vehicleMake);
		mainpanel.add(inMake);
		
		vehicleModel.setBounds(10, 170, 100, 25);
		inModel.setBounds(105, 170, 155, 25);
		mainpanel.add(vehicleModel);
		mainpanel.add(inModel);
		
		vehicleColor.setBounds(10, 210, 100, 25);
		inColor.setBounds(105, 210, 155, 25);
		mainpanel.add(vehicleColor);
		mainpanel.add(inColor);
		
		vehicleAvailability.setBounds(10, 250, 100, 25);
		inAvailability.setBounds(105, 250, 155, 25);
		mainpanel.add(vehicleAvailability);
		mainpanel.add(inAvailability);
		
		vehicleDamageNotes.setBounds(10, 290, 100, 25);
		inDamageNotes.setBounds(105, 290, 155, 25);
		mainpanel.add(vehicleDamageNotes);
		mainpanel.add(inDamageNotes);
		
		saveButton.setBounds(550, 290, 65, 25);
		saveButton.addActionListener(this);
		mainpanel.add(saveButton);
		
		savedMessage.setBounds(450, 150, 150, 100);
		mainpanel.add(savedMessage);
		
		frame.setVisible(true);
	}
	
	// --------------------------------------------------
	// This method allows the "store" button to properly function and record the entered information.
	public void actionPerformed(ActionEvent e) {
		int newVIN = Integer.parseInt(inVIN.getText());
		int newYear = Integer.parseInt(inYear.getText());
		String newMake = inMake.getText();
		String newModel = inModel.getText();
		String newColor = inColor.getText();
		int newAvailability = Integer.parseInt(inAvailability.getText());
		String newDamageNotes = inDamageNotes.getText();
		V1OwnerCar newVehicle = new V1OwnerCar(newVIN, newYear, newMake, newModel, newColor, newAvailability, newDamageNotes);
		System.out.println(newVehicle.getVehicleInfo());
		
		savedMessage.setText("<html>The entered information has been successfully stored.</html>");
	}
	
	public static void main(String[] args)
	{
		V1OwnerCarViewer viewer = new V1OwnerCarViewer();
	}
	
}
