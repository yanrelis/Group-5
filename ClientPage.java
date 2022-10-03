package jframe;

import java.awt.*;
import javax.swing.*;

//
public class ClientPage {

	JFrame frame = new JFrame();

	final int FrameWidth = 600;
	final int FrameHeight = 400;

	private JLabel label;
	private JPanel panel;

	// 
	public ClientPage() {
		label = new JLabel("Enter Client ID and Job Details");
		label.setBounds(155, 10, 400, 50);
		label.setFont(new Font("Nunito", Font.BOLD, 18));

		createPanel();

		frame.setTitle("Vehicular Cloud Real-Time System"); // adds title to GUI header

		// parameters of GUI size & attributes
		frame.setSize(FrameWidth, FrameHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	//
		label = new JLabel("Client ID: ");
		label.setBounds(45, 120, 400, 50);
		label.setFont(new Font("Nunito", Font.ITALIC, 15));
		panel.add(label);
		
		JTextField userText = new JTextField();
		userText.setBounds(120, 130, 300, 30);
		panel.add(userText);
		frame.setVisible(true);
		
		
	//
		label = new JLabel("Approx Job Duration: ");
		label.setBounds(15, 170, 400, 50);
		label.setFont(new Font("Nunito", Font.ITALIC, 15));
		panel.add(label);
		
		JTextField userText1 = new JTextField();
		userText1.setBounds(169, 180, 300, 30);
		panel.add(userText1);
		frame.setVisible(true);
		
		
	//
		label = new JLabel("Job Deadline: ");
		label.setBounds(72, 200, 400, 50);
		label.setFont(new Font("Nunito", Font.ITALIC, 15));
		panel.add(label);
		
		JTextField userText2 = new JTextField();
		userText2.setBounds(169, 210, 300, 30);
		panel.add(userText2);
		frame.setVisible(true);
	}

	private void createPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0x886be0));
		panel.add(label);

		// adds to current object
		frame.add(panel);
	}
}
