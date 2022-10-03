package jframe;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OwnerLogin {

	JFrame frame = new JFrame();

	final int FrameWidth = 600;
	final int FrameHeight = 400;

	private JLabel label;
	private JPanel panel;
	private JButton back;

	public OwnerLogin() {
		label = new JLabel("Enter Vehicle Information:");
		label.setBounds(180, 10, 400, 50);
		label.setFont(new Font("Nunito", Font.BOLD, 18));

		createPanel(); //

		frame.setTitle("Vehicular Cloud Real-Time System"); // adds title to GUI header

		// parameters of GUI size & attributes
		frame.setSize(FrameWidth, FrameHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		
	//
		label = new JLabel("Owner ID: ");
		label.setBounds(45, 120, 400, 50);
		label.setFont(new Font("Nunito", Font.ITALIC, 15));
		panel.add(label);

		JTextField userText = new JTextField();
		userText.setBounds(120, 130, 300, 30);
		panel.add(userText);
		frame.setVisible(true);
		
		
	//
		label = new JLabel("Vehicle Info: ");
		label.setBounds(90, 170, 400, 50);
		label.setFont(new Font("Nunito", Font.ITALIC, 15));
		panel.add(label);

		JTextField userText2 = new JTextField();
		userText2.setBounds(180, 180, 300, 30);
		panel.add(userText2);
		frame.setVisible(true);
		
		
	//
		label = new JLabel("Approx Residency Time: ");
		label.setBounds(8, 200, 400, 50);
		label.setFont(new Font("Nunito", Font.ITALIC, 15));
		panel.add(label);

		JTextField userText3 = new JTextField();
		userText3.setBounds(180, 210, 300, 30);
		panel.add(userText3);
		frame.setVisible(true);
		
	/*	
	 	back = new JButton("Back");
		back.setBounds(130, 350, 100, 20);
	    back.setForeground(Color.blue);
	    back.addActionListener(();
	    panel.add (back);
	    back.setVisible(true);
	*/
		
	}

	private void createPanel() {
		panel = new JPanel();

		panel.setLayout(null);
		panel.setBackground(new Color(0xefac5e));
		panel.add(label);

		// adds to current object
		frame.add(panel);
	}
}
