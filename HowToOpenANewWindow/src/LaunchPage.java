/* Project: Project Milestone 2: GUI
Class: Main.java
Author: Yanelis Cruceta
Date: October 2, 2022
This class allows a you to be able to open a new window from one frame. This is the launch page. */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Window");
	
	
	LaunchPage(){
		
		myButton.setBounds(100, 160, 200, 40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.add(myButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==myButton) {
			frame.dispose();
			NewWindow myWindow = new NewWindow();
			
		}
		
	}
	
}
