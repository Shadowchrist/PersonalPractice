package com.SampleAddressBook;
import java.util.*;

public class AddressBookSingle {
		
	public String name;
	public HashMap<String, AddressBookMain> addressbook;
	public AddressBookSingle(String bookName, HashMap<String, AddressBookMain> book) 
	{
		this.name=bookName;
		this.addressbook=book;
	}
	public static void addDetails(AddressBookSingle book)
	{
		String firstName=UserInput.getFirstName();
		String lastName=UserInput.getLastName();
		String index=firstName+" "+lastName;
		index=index.toUpperCase();
		String address=UserInput.getAddress();
		String city=UserInput.getCity();
		String state=UserInput.getState();
		String zip=UserInput.getZipcode();
		String phoneNumber=UserInput.getPhoneNumber();
		String email=UserInput.getEmail();
		String password=UserInput.getPassword();
		book.addressbook.put(index,new AddressBookMain(firstName,lastName,address,city,
						   state,zip,phoneNumber,email,password));
		System.out.println("New contact added.");
		book.addressbook.get(index).Display();
	}
	
	public static void editDetails(AddressBookSingle book)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String firstName=UserInput.getFirstName();
		String lastName=UserInput.getLastName();
		String index=firstName+" "+lastName;
		index=index.toUpperCase();
		if(!book.addressbook.isEmpty()&&book.addressbook.containsKey(index))
		{
			int flag=0;
			while(flag==0)
			{
				System.out.println("What do you want to edit? \n"
						+ "1. Address \n"
						+ "2. City \n"
						+ "3. State \n"
						+ "4. Email ID \n"
						+ "5. Phone Number \n"
						+ "6. Password \n"
						+ "7. Editing finished \n");
				System.out.println("Enter your choice: \n");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						String newaddress=UserInput.getAddress();
						book.addressbook.get(index).address=newaddress;
						String newzip=UserInput.getZipcode();
						book.addressbook.get(index).zip=newzip;
						break;
					case 2:
						String newcity=UserInput.getCity();
						book.addressbook.get(index).city=newcity;
						String newaddress1=UserInput.getAddress();
						book.addressbook.get(index).address=newaddress1;
						String newzip1=UserInput.getZipcode();
						book.addressbook.get(index).zip=newzip1;
						break;	
					case 3:
						String newstate=UserInput.getState();
						book.addressbook.get(index).state=newstate;
						String newcity1=UserInput.getCity();
						book.addressbook.get(index).city=newcity1;
						String newaddress2=UserInput.getAddress();
						book.addressbook.get(index).address=newaddress2;
						String newzip2=UserInput.getZipcode();
						book.addressbook.get(index).zip=newzip2;
						break;
					case 4:
						String newemail=UserInput.getEmail();
						book.addressbook.get(index).email=newemail;
						break;
					case 5:
						String newnumber=UserInput.getPhoneNumber();
						book.addressbook.get(index).phoneNumber=newnumber;
						break;
					case 6:
						String newpassword=UserInput.getPassword();
						book.addressbook.get(index).password=newpassword;
						break;
					case 7:
						System.out.println("Changes saved.");
						flag=1;
						break;
					default:
						System.out.println("Invalid choice!!!");
				}
			}
			System.out.println(" Updated Contact details: ");
			book.addressbook.get(index).Display();
		}	
		else
			System.out.println("Contact does not exist!!!");
	}
	
	public static void removeDetails(AddressBookSingle book)
	{
		String firstName=UserInput.getFirstName();
		String lastName=UserInput.getLastName();
		String index=firstName+" "+lastName;
		index=index.toUpperCase();
		if(!book.addressbook.isEmpty()&&book.addressbook.containsKey(index))
		{
			book.addressbook.remove(index);
			System.out.println("Contact removed.");
		}
		else
			System.out.println("Contact does not exist!!!");
	}
	
	public static void displayDetails(AddressBookSingle book)
	{
		String firstName=UserInput.getFirstName();
		String lastName=UserInput.getLastName();
		String index=firstName+" "+lastName;
		index=index.toUpperCase();
		if(!book.addressbook.isEmpty()&&book.addressbook.containsKey(index))
		{
			book.addressbook.get(index).Display();
		}
		else
			System.out.println("Contact does not exist!!!"); 
	}
	
	public static void bookOperations(AddressBookSingle book)
	{
		while(true)
		{
			System.out.println("Active Book: "+book.name);
			
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter 1 to add a contact detail.");
			System.out.println("Enter 2 to edit a contact detail.");
			System.out.println("Enter 3 to remove a contact detail.");
			System.out.println("Enter 4 to display a contact detail.");
			System.out.println("Enter 5 to return.");
			System.out.println("Enter your choice:");
			
			int ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					addDetails(book);
					break;
				case 2:
					editDetails(book);
					break;
				case 3:					
					removeDetails(book);
					break;
				case 4:
					displayDetails(book);
					break;
				default:
					return;
			}
		}
	}
}	
