/* Project: Project Milestone 4: Class Implementation
* Class: VehicleOwner.java
* Author: Andrew Vargas
* Date: October 22nd, 2022
* This class is used to create objects pertaining to each individual vehicle owner.
*/ 

import java.io.*;
import java.util.*;

public class VehicleOwner extends User {
	
	private int ownerID;
	private String password;
	private ArrayList<Vehicle> ownedVehicles;
	// private ArrayList<User> ownerInfo; <------ finish working on this later (potentially move to System class)
	
	public VehicleOwner(String firstName, String lastName, String phoneNumber, String email, String password)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
		this.setEmail(email);
		this.password = password;
		ownerID = generateOwnerID();
	}
	
	public static int generateOwnerID() // This method generates a random ID that hasn't been used yet.
	{
		int generatedID = (int) (1000 + (Math.random() * 8999));
		
		try
		{
			File file = new File("SavedInfo\\OwnerInfo.txt");
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
	
	public int getOwnerID()
	{
		return ownerID;
	}
	
	public void setOwnerID(int ownerID)
	{
		this.ownerID = ownerID;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void addVehicle(Vehicle vehicle)
	{
		ownedVehicles.add(vehicle);
	}
	
	public static void main(String[] args)
	{
		generateOwnerID();
	}
	
}
