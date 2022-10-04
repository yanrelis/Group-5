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
private JButton button; // MINE
private JLabel labelHeader;
private JLabel labelOption;


public Main(){
	frame = new JFrame("Vehicular Cloud Real-Time System");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(new Dimension(600,400)); //MINE
	frame.setLayout(new FlowLayout()); //MINE
	frame.setFocusable(false); //MINE
	
	button = new JButton("Start"); //MINE 
	button.addActionListener(this); //MINE
	frame.add(button); //MINE
	frame.setLocationRelativeTo(null); //MINE
	frame.setVisible(true); //MINE
}

@Override
public void actionPerformed(ActionEvent e) { // MINE
	// TODO Auto-generated method stub
	if(e.getActionCommand().equals("Start")) { //MINE
		Main2 ob = new Main2(); //MINE
		ob.frame.setVisible(true); //MINE
		frame.dispose(); //MINE
		
	}
}
public static void main(String args[]) { //MINE
	new Main(); //MINE
}

class Main2 implements ActionListener{ //MINE
	JFrame frame; //MINE
	JButton button; //MINE
	Main2(){ //MINE
	frame = new JFrame("End Screen"); //MINE
	frame.setSize(new Dimension(600,400)); //MINE
	frame.setLayout(new FlowLayout()); //MINE
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //MINE
	button = new JButton("Back"); //MINE
	button.addActionListener(this); //MINE
	frame.add(button); //MINE
	frame.setLocationRelativeTo(null); //MINE
	frame.setVisible(true); //MINE
	
}

@Override
public void actionPerformed(ActionEvent e) { // MINE
	// TODO Auto-generated method stub
	if(e.getActionCommand().equals("Back")) { //MINE
		Main ob = new Main(); //MINE
		ob.frame.setVisible(true); //MINE
		frame.dispose(); //MINE
		
	}
}
}
}