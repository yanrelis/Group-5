/* Project: Project Milestone 4: Class Implementation
* Class: VehicleOwner.java
* Author: Andrew Vargas
* Date: October 25th, 2022
* This class is used to create objects pertaining to each individual vehicle.
*/ 

public class Vehicle {
	
	private String vehicleVIN;
	private int vehicleYear;
	private String vehicleMake;
	private String vehicleModel;
	private String vehicleColor;
	private boolean vehicleCheckedIn;
	private String vehicleDamageNotes;
	private boolean vehicleAvailability;
	private boolean vehicleReserved;
	// private VehicleOwner vehicleOwner; <--- not sure if this is needed
	
	public Vehicle(String vehicleVIN, int vehicleYear, String vehicleMake, String vehicleModel, String vehicleColor, boolean vehicleCheckedIn, String vehicleDamageNotes, boolean vehicleAvailability, boolean vehicleReserved)
	{
		this.vehicleVIN = vehicleVIN;
		this.vehicleYear = vehicleYear;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.vehicleColor = vehicleColor;
		this.vehicleCheckedIn = vehicleCheckedIn;
		this.vehicleAvailability = vehicleAvailability;
		this.vehicleReserved = vehicleReserved;
	}
	
	public String getVehicleVIN()
	{
		return vehicleVIN;
	}
	
	public void setVehicleVIN(String vehicleVIN)
	{
		this.vehicleVIN = vehicleVIN;
	}
	
	public int getVehicleYear()
	{
		return vehicleYear;
	}
	
	public void setVehicleYear(int vehicleYear)
	{
		this.vehicleYear = vehicleYear;
	}
	
	public String getVehicleMake()
	{
		return vehicleMake;
	}
	
	public void setVehicleMake(String vehicleMake)
	{
		this.vehicleMake = vehicleMake;
	}
	
	public String getVehicleModel()
	{
		return vehicleModel;
	}
	
	public void setVehicleModel(String vehicleModel)
	{
		this.vehicleModel = vehicleModel;
	}
	
	public String getVehicleColor()
	{
		return vehicleColor;
	}
	
	public void setVehicleColor(String vehicleColor)
	{
		this.vehicleColor = vehicleColor;
	}
	
	public boolean getVehicleCheckedIn()
	{
		return vehicleCheckedIn;
	}
	
	public void setVehicleCheckedIn(boolean vehicleCheckedIn)
	{
		this.vehicleCheckedIn = vehicleCheckedIn;
	}
	
	public String getVehicleDamageNotes()
	{
		return vehicleDamageNotes;
	}
	
	public void setVehicleDamageNotes(String vehicleDamageNotes)
	{
		this.vehicleDamageNotes =  vehicleDamageNotes;
	}
	
	public boolean getVehicleAvailability()
	{
		return vehicleAvailability;
	}
	
	public void setVehicleAvailability(boolean vehicleAvailability)
	{
		this.vehicleAvailability = vehicleAvailability;
	}
	
	public boolean getVehicleReserved()
	{
		return vehicleReserved;
	}
	
	public void setVehicleReserved(boolean vehicleReserved)
	{
		this.vehicleReserved = vehicleReserved;
	}
	
}
