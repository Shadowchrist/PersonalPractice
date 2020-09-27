package com.SampleAddressBook;

public class AddressBookMain {

	public String firstName;
	public String lastName;
	public String address; 
	public String city;
	public String state;
	public String zip;
	public String phoneNumber;
	public String email;
	public String password;
	
	public AddressBookMain(String firstName, String lastName, String address, 
						   String city, String state, String zip, 
						   String phoneNumber, String email, String password)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phoneNumber=phoneNumber;
		this.email=email;
		this.password=password;
	}
	

	
	public void Display()
	{
		System.out.println("First Name: "+ firstName);
		System.out.println("Last Name: "+ lastName);
		System.out.println("Address: "+ address);
		System.out.println("City: "+ city);
		System.out.println("State: "+ state);
		System.out.println("Zipcode: "+ zip);
		System.out.println("Phone Number: "+ phoneNumber);
		System.out.println("Email ID: "+ email);
	}
	
}
