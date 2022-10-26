import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JobViewer  implements ActionListener {
	
	private JFrame frame;
	private JPanel mainpanel;
	private JLabel instructions,JobID, JobName,JobInfo, timeMin, savedMessage;
	private JTextField inID, inName,inInfo, inMinutes;
	private JButton submitJob, backButton;
	

	public JobViewer()
	{
		frame = new JFrame();
		mainpanel = new JPanel();
		instructions = new JLabel("<html>Here you can submit a job. Please enter the job information. Click the submit button Once you are finished.</html>");
		JobID = new JLabel("Job ID");
		inID = new JTextField(6);
		JobName = new JLabel("Job Name");
		inName = new JTextField(15);
		JobInfo = new JLabel("Job Info");
		inInfo = new JTextField(40);
		timeMin = new JLabel("Job Duration");
		inMinutes = new JTextField(4);
		submitJob = new JButton("Submit");
		backButton = new JButton("Back");
		savedMessage = new JLabel("");
		
		frame.setSize(640, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Job Submission");
		
		frame.add(mainpanel);
		mainpanel.setLayout(null);
		instructions.setBounds(10, 10, 620, 35);
		mainpanel.add(instructions);
		
		JobID.setBounds(10, 50, 100, 25);
		inID.setBounds(105, 50, 155, 25);
		mainpanel.add(JobID);
		mainpanel.add(inID);
		
		JobName.setBounds(10, 90, 100, 25);
		inName.setBounds(105, 90, 155, 25);
		mainpanel.add(JobName);
		mainpanel.add(inName);
		
		JobInfo.setBounds(10, 130, 100, 25);
		inInfo.setBounds(105, 130, 155, 25);
		mainpanel.add(JobInfo);
		mainpanel.add(inInfo);
		
		timeMin.setBounds(10, 170, 100, 25);
		inMinutes.setBounds(105, 170, 155, 25);
		mainpanel.add(timeMin);
		mainpanel.add(inMinutes);
		
		submitJob.setBounds(10, 250, 100, 25);
		submitJob.addActionListener(this);
		mainpanel.add(submitJob);
		
		backButton.setBounds(10, 290, 65, 25);
		backButton.addActionListener(new backButton());
		mainpanel.add(backButton);
		
		savedMessage.setBounds(50, 250, 150, 100);
		mainpanel.add(savedMessage);
		mainpanel.setBackground(new Color(0xe9fff8));
		
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		int newJobID = Integer.parseInt(inID.getText());
		String newJobName = inName.getText();
		int newTimeMin = Integer.parseInt(inMinutes.getText());
		String newJobInfo = inInfo.getText();
		Job newJob = new Job(newJobID,newTimeMin,newJobName,newJobInfo);
		System.out.println(newJob.getJobInfo());
	
	
		//--------------------------------------------------
				//Added a file printer that stores vehicle information
				File file = new File("SavedInfo\\JobInfo.txt");  //create new file where info will be stored 
				file.getParentFile().mkdirs(); //use getParentFile().mkdirs() to have location where file is stored created automatically
						     		//if it does not exist
						    	 
						     try{ //catch exception when printing into file
						    	 PrintWriter fileWriter = new PrintWriter(new FileWriter (file, true)); //create writer
						   	    	
						   	    fileWriter.println("Job ID: "+newJobID); //get information inputed into program and print into file
						   	    fileWriter.println("Job Name: "+newJobName);
						   	    fileWriter.println("Job Duration: "+newTimeMin);
						   	    fileWriter.println("Job Info: "+newJobInfo);
						   	    fileWriter.flush();
						   	    fileWriter.close(); //flush and close writer
						   	    System.out.println("Job information stored"); //print into console when info was saved into file
						   	    
						   	} catch (IOException k) {
						   	   k.printStackTrace();
							 }
						     savedMessage.setText("<html>The job has been submitted.</html>");
	}
	
	
	public class backButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			WelcomePage welcome = new WelcomePage();
		}
	}
	
	public static void main(String[] args)
	{
		JobViewer viewer = new JobViewer();
	}
	

}
