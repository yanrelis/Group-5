/* Project: Project Milestone 2: GUI
* Class: V1OwnerCar.java
* Author: Andrew Vargas
* Date: October 1st, 2022
* This class is used to create objects pertaining to each individual vehicle and stores the
* VIN numbers, the year the vehicle was made, the makes and models of each vehicle, the color
* of the vehicle, the length of time the vehicle is available, and any notes an inspector may
* have regarding damage present on the vehicle. This class also contains a method that returns
* all of the information recorded about the specified vehicle in a few sentences.
*/ 

public class V1OwnerCar {
	
	private int vehicleVIN;
	private int vehicleYear;
	private String vehicleMake;
	private String vehicleModel;
	private String vehicleColor;
	private int vehicleAvailability;
	private String vehicleDamageNotes;
	
	// --------------------------------------------------
	// This constructor method creates an object that stores all of the information pertaining to the vehicle entered.
	public V1OwnerCar(int vehicleVIN, int vehicleYear, String vehicleMake, String vehicleModel, String vehicleColor, int vehicleAvailability, String vehicleDamageNotes)
	{
		this.vehicleVIN = vehicleVIN;
		this.vehicleYear = vehicleYear;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.vehicleColor = vehicleColor;
		this.vehicleAvailability = vehicleAvailability;
		this.vehicleDamageNotes = vehicleDamageNotes;

	}
	
	// --------------------------------------------------
	// This method sets the VIN of the specified vehicle.
	public void setVehicleVIN(int vehicleVIN)
	{
		this.vehicleVIN = vehicleVIN;
	}
	
	// --------------------------------------------------
	// This method returns the VIN of the specified vehicle.
	public int getVehicleVIN()
	{
		return vehicleVIN;
	}
	
	// --------------------------------------------------
	// This method sets the year of the specified vehicle.
	public void setVehicleYear(int vehicleYear)
	{
		this.vehicleYear = vehicleYear;
	}
	
	// --------------------------------------------------
	// This method returns the year of the specified vehicle.
	public int getVehicleYear()
	{
		return vehicleYear;
	}
	
	// --------------------------------------------------
	// This method sets the make of the specified vehicle.
	public void setVehicleMake(String vehicleMake)
	{
		this.vehicleMake = vehicleMake;
	}
	
	// --------------------------------------------------
	// This method returns the make of the specified vehicle.
	public String getVehicleMake()
	{
		return vehicleMake;
	}
	
	// --------------------------------------------------
	// This method sets the model of the specified vehicle.
	public void setVehicleModel(String vehicleModel)
	{
		this.vehicleModel = vehicleModel;
	}
	
	// --------------------------------------------------
	// This method returns the model of the specified vehicle.
	public String getVehicleModel()
	{
		return vehicleModel;
	}
	
	// --------------------------------------------------
	// This method sets the color of the specified vehicle.
	public void setVehicleColor(String vehicleColor)
	{
		this.vehicleColor = vehicleColor;
	}
	
	// --------------------------------------------------
	// This method returns the color of the specified vehicle.
	public String getVehicleColor()
	{
		return vehicleColor;
	}
	
	// --------------------------------------------------
	// This method sets the length of time the specified vehicle is available for.
	public void setVehicleAvailability(int vehicleAvailability)
	{
		this.vehicleAvailability = vehicleAvailability;
	}
	
	// --------------------------------------------------
	// This method returns the length of the time the specified vehicle is available for.
	public int getVehicleAvailability()
	{
		return vehicleAvailability;
	}
	
	// --------------------------------------------------
	// This method sets the notes an inspector has regarding the specified vehicle.
	public void setVehicleDamageNotes(String vehicleDamageNotes)
	{
		this.vehicleDamageNotes = vehicleDamageNotes;
	}
	
	// --------------------------------------------------
	// This method returns the inspector's notes regarding the specified vehicle.
	public String getVehicleDamageNotes()
	{
		return vehicleDamageNotes;
	}
	
	// --------------------------------------------------
	// This method returns a String containing all of the information regarding the specified vehicle.
	public String getVehicleInfo()
	{
		String info = "The vehicle in question is a " + vehicleColor + " " + vehicleYear + " " + vehicleMake + " " + vehicleModel + " with the VIN " + vehicleVIN + ". It is available for " + vehicleAvailability + " seconds and ";
		if (vehicleDamageNotes.equals(""))
		{
			info += "has no recorded damage information.";
		}
		else
		{
			info += "has the following damage notes: " + vehicleDamageNotes;
		}
		return info;
	}
	
}
