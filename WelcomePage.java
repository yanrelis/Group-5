package jframe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WelcomePage implements ActionListener {

	// set bounds for GUI
	final int FrameWidth = 600;
	final int FrameHeight = 400;

	// initialize JFrame
	JFrame frame = new JFrame();

	//
	private JButton Owner;
	private JButton Client;
	private JLabel labelHeader;
	private JLabel labelOption;

	private JPanel panel;

	// set parameters of JFrame
	public WelcomePage() {

		frame.setSize(FrameWidth, FrameHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setTitle("Vehicular Cloud Real-Time System");

		labelHeader = new JLabel("Welcome Back!");
		labelHeader.setBounds(175, 10, 300, 30); // set location of label
		labelHeader.setFont(new Font("Nunito", Font.BOLD, 35));

		labelOption = new JLabel("Choose an option below to continue:");
		labelOption.setBounds(160, 100, 300, 30); // Set location of label
		labelOption.setFont(new Font("Nunito", Font.ITALIC, 16));

		ImageIcon image = new ImageIcon("VCC.png");
		frame.setIconImage(image.getImage());

		ButtonOwner();
		ClientButton();
		createPanel();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == Client) {
			frame.dispose();
			ClientPage client = new ClientPage();
		} else if (event.getSource() == Owner) {
			frame.dispose();
			OwnerLogin login = new OwnerLogin();
		}
	}

	// Create Owner Button
	private void ButtonOwner() {
		Owner = new JButton("Owner");

		Owner.setBounds(320, 190, 140, 25); // Set location of button\
		Owner.setBackground(new Color(0, 25, 25));
		Owner.addActionListener(this);

	}

	// Create Client Button
	private void ClientButton() {
		Client = new JButton("Client");

		Client.setBounds(160, 190, 140, 25); // Set location of button
		Client.setBackground(new Color(0, 25, 25));
		Client.addActionListener(this);
	}

	// create a panel to show the labels/buttons on GUI
	private void createPanel() {
		panel = new JPanel();
		//
		panel.setLayout(null);
		panel.add(Owner);
		panel.add(Client);
		panel.add(labelHeader);
		panel.add(labelOption);
		panel.setBackground(new Color(0x057abc)); // background color
		// adds to current object
		frame.add(panel);

	}

}
