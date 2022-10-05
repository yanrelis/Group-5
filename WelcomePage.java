/* Project: Project Milestone 2: GUI
* Class: WelcomePage.java
* Author: Matthew Lardi
* Date: October 3, 2022
* This class is used to create the opening GUI to welcome a user to the system.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage implements ActionListener {

	//main method to run WelcomePage
	public static void main(String[] args) {
		// SystemFrame systemFrame = new SystemFrame();
		WelcomePage welcomePage = new WelcomePage();
	}

	// set bounds for GUI
	final int FrameWidth = 600;
	final int FrameHeight = 400;

	// access modifier for variables/constructors
	private JButton Owner;
	private JButton Client;
	private JLabel labelHeader;
	private JLabel labelOption;
	private JPanel panel;

	// initialize JFrame
	JFrame frame = new JFrame();

	// set parameters of JFrame
	public WelcomePage() {

		frame.setSize(FrameWidth, FrameHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setTitle("Vehicular Cloud Real-Time System");

		// welcome label parameters
		labelHeader = new JLabel("Welcome Back!");
		labelHeader.setBounds(175, 40, 300, 30);
		labelHeader.setFont(new Font("Nunito", Font.BOLD, 35));

		// label option parameters
		labelOption = new JLabel("Choose an option below to continue:");
		labelOption.setBounds(160, 100, 300, 30);
		labelOption.setFont(new Font("Nunito", Font.ITALIC, 16));

		ButtonOwner();
		ClientButton();
		createPanel();
		frame.setVisible(true);
	}

	// linking WelcomePage to Client & Owner Frames
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Client) {
			frame.dispose();
			V1ClientInfo clientFrame = new V1ClientInfo();
			clientFrame.setVisible(true);
		} else if (e.getSource() == Owner) {
			frame.dispose();
			V1OwnerInfo ownerFrame = new V1OwnerInfo();
			ownerFrame.setVisible(true);
		}
	}

	// Create Owner Button
	public void ButtonOwner() {
		Owner = new JButton("Owner"); // setting title & bounds of button
		Owner.setBounds(320, 190, 140, 25);
		Owner.setBackground(new Color(0, 25, 25));
		Owner.addActionListener(this);

	}

	// Create Client Button
	public void ClientButton() {
		Client = new JButton("Client"); // setting title & bounds of button
		Client.setBounds(160, 190, 140, 25);
		Client.setBackground(new Color(0, 25, 25));
		Client.addActionListener(this);

	}

	// panel that displays each attribute to GUI
	private void createPanel() {
		panel = new JPanel();

		panel.setLayout(null);
		panel.add(Owner);
		panel.add(Client);
		panel.add(labelHeader);
		panel.add(labelOption);
		panel.setBackground(new Color(0xe06666));
		frame.add(panel);

	}
}
