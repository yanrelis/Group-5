import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage implements ActionListener {

	public static String currentState = "";
	
	// main method to run WelcomePage
	public static void main(String[] args) {
		// SystemFrame systemFrame = new SystemFrame();
		WelcomePage welcomePage = new WelcomePage();
	}

	// set bounds for GUI
	final int FrameWidth = 620;
	final int FrameHeight = 400;

	// access modifier for variables/constructors
	private JButton register, login;
	private JLabel labelOption, labelHeader;
	private JPanel panel;
	private JComboBox list;

	// initialize JFrame

	 JFrame frame = new JFrame();
	

	// set parameters of JFrame
	public WelcomePage() {

		frame.setSize(FrameWidth, FrameHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.setResizable(false);
		frame.setTitle("Vehicular Cloud Real-Time System");

		// welcome label parameters
		labelHeader = new JLabel("Welcome!");
		labelHeader.setBounds(230, 40, 300, 30);
		labelHeader.setFont(new Font("Times New Roman", Font.BOLD, 35));

		// label option parameters
		labelOption = new JLabel("Choose an option below to continue:");
		labelOption.setBounds(160, 100, 300, 30);
		labelOption.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		

		RegisterButton();
		loginButton();
		createPanel();
	
		String[] options = {"Vehicle Owner", "Client", "Cloud Controller"}; 
		list = new JComboBox(options);
		list.setBounds(240,170,140,30);
        panel.add(list);
        panel.add(register);
        
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	// Create Register Button
	
	//register.setBounds(160, 190, 140, 25);
	

	// Create Login Button
	public void RegisterButton(){
		register = new JButton("Register");// setting title & bounds of button
		register.setBounds(160, 240, 140, 25);
		register.setBackground(Color.white);
		register.addActionListener(this);
	}

	public void loginButton() {
		login = new JButton("Login");
		login.setBounds(340, 240, 140, 25);
		ActionListener listener1 = new loginListener(); 
		login.addActionListener(listener1);
		
	}
	public class loginListener implements ActionListener {
		 public void actionPerformed(ActionEvent event){
			 if (list.getSelectedItem().equals("Vehicle Owner"))
				{
					currentState = "owner";
					frame.dispose();
					System.out.println("Vehicle Owner was selected");
				}
				else if (list.getSelectedItem().equals("Client"))
				{
					currentState = "client";
					frame.dispose();
					System.out.println("Client was selected");
				}
				else if (list.getSelectedItem().equals("Cloud Controller"))
				{
					currentState = "controller";
					frame.dispose();
					System.out.println("Cloud Controller was selected");
				}
			 new Login();
		 }}
	
	// panel that displays each attribute to GUI
	private void createPanel() {
		panel = new JPanel();
		panel.add(register);
		panel.add(login);
		panel.setLayout(null);
		panel.add(labelHeader);
		panel.add(labelOption);
		panel.setBackground(new Color(0xcebdfb));
		frame.add(panel);
	}
 
	// linking the client & owner buttons to the welcomePage
	public void actionPerformed(ActionEvent e) {
		if (list.getSelectedItem().equals("Vehicle Owner"))
		{
			currentState = "owner";
			frame.dispose();
			new VehicleOwner();
			System.out.println("Vehicle Owner was selected");
		}
		else if (list.getSelectedItem().equals("Client"))
		{
			currentState = "client";
			frame.dispose();
			new Client();
			System.out.println("Client was selected");
		}
		else if (list.getSelectedItem().equals("Cloud Controller"))
		{
			currentState = "controller";
			frame.dispose();
			new CloudController();
			System.out.println("Cloud Controller was selected");
		}
			/* JComponent comp = (JComponent) e.getSource();
			  Window win = SwingUtilities.getWindowAncestor(comp);
			  win.dispose();
			  new Login(); */
		} 
	}
       ;
