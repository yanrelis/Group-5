/* Project: Project Milestone 4: Class Implementation
* Class: User.java
* Author: Andrew Vargas
* Date: October 22nd, 2022
* This abstract class contains basic information regarding users and methods to obtain and change them.
*/ 

public abstract class User {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
}
