import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main implements ActionListener{
private JFrame frame; // 	MINE
private JButton button;  
private JLabel labelHeader;
private JLabel labelOption;


public Main(){
	frame = new JFrame("Vehicular Cloud Real-Time System");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(new Dimension(600,400));  
	frame.setLayout(new FlowLayout()); 
	frame.setFocusable(false);  
	
	button = new JButton("Start");   
	button.addActionListener(this);  
	frame.add(button);  
	frame.setLocationRelativeTo(null);  
	frame.setVisible(true);  
}

@Override
public void actionPerformed(ActionEvent e) {  
	// TODO Auto-generated method stub
	if(e.getActionCommand().equals("Start")) {  
		Main2 ob = new Main2();  
		ob.frame.setVisible(true);  
		frame.dispose();  
		
	}
}
public static void main(String args[]) {  
	new Main();  
}

class Main2 implements ActionListener{  
	JFrame frame;  
	JButton button;  
	Main2(){  
	frame = new JFrame("End Screen");  
	frame.setSize(new Dimension(600,400));  
	frame.setLayout(new FlowLayout());  
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	button = new JButton("Back");  
	button.addActionListener(this);  
	frame.add(button);  
	frame.setLocationRelativeTo(null);  
	frame.setVisible(true);  
	
}

@Override
public void actionPerformed(ActionEvent e) {  
	// TODO Auto-generated method stub
	if(e.getActionCommand().equals("Back")) {  
		Main ob = new Main();  
		ob.frame.setVisible(true);  
		frame.dispose();  
	
	}
}
}
}
