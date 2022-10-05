/* Project: Project Milestone 2: GUI
Class: Main.java
Author: Yanelis Cruceta
Date: October 2, 2022
This class allows a you to be able to open a new window from one frame. This is the new window page. */
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello!");
	
	NewWindow(){
	
		label.setBounds(0,0,100,50);
		label.setFont(new Font(null, Font.PLAIN,25));
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
}
