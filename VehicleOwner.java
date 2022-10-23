/* Project: Project Milestone 4: Class Implementation
* Class: VehicleOwner.java
* Author: Andrew Vargas
* Date: October 22nd, 2022
* This class is used to create objects pertaining to each individual vehicle owner.
*/ 

import java.util.*;

public class VehicleOwner extends User {
	
	private int ownerID;
	private String password;
	private ArrayList<Vehicle> ownedVehicles;
	// private ArrayList<User> ownerInfo; <--- this was on the UML diagram but I'm not sure this is necessary
	
	public VehicleOwner(String firstName, String lastName, String phoneNumber, String email, String password)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
		this.setEmail(email);
		this.password = password;
		ownerID = generateOwnerID();
	}
	
	public static int generateOwnerID()
	{
		int generatedID = (int) (Math.random() * 10000);
		
		// I still need to finish the code that ensures the randomly generated ID hasn't already been used.
		
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
	
}
