import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Client extends User {
	
	private int clientID;
	private String password;
	private String jobName;
	// private ArrayList<User> clientInfo; <----- finish working on this later
	
	public Client(String password, String jobName)
	{
		this.password = password;
		this.jobName = jobName;
		clientID = generateOwnerID();
	}
	
	public static int generateOwnerID() // This method generates a random ID that hasn't been used yet.
	{
		int generatedID = (int) (1000 + (Math.random() * 8999));
		
		try
		{
			File file = new File("SavedInfo\\ClientInfo.txt");
			file.getParentFile().mkdirs();
			Scanner scnr = new Scanner(file);
			System.out.println(generatedID);
			
			while (scnr.hasNext())
			{
				String currentLine = scnr.nextLine();
				
				if ((currentLine.length() > 8) && (currentLine.substring(0, 8).equals("OwnerID:")))
				{
					int usedID = Integer.parseInt(currentLine.substring(9, currentLine.length()));
					if (generatedID == usedID)
					{
						System.out.println("Match found!");
						generateOwnerID();
					}
				}
			}
			
			System.out.println("No match found!");
			scnr.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File cannot be found.");
		}
		
		return generatedID;
	}
	
	public int getClientID()
	{
		return clientID;
	}
	
	public void setClientID(int clientID)
	{
		this.clientID = clientID;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getJobName()
	{
		return jobName;
	}
	
	public void setJobName(String jobName)
	{
		this.jobName = jobName;
	}
	
}
