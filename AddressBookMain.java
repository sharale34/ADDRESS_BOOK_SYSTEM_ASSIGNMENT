package com.bridgelabz.Contact;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		//creating object and assigning values to variables
	    Scanner sc = new Scanner(System.in);
	    Contact obj = new Contact();
	    int choice=0;
	    do {
	    	System.out.println("Please Enter from the Menu.\n1. Add a Contact: \n2. Delete a contact using the First Name: \n3. Exit");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
		    System.out.println("Enter the contact details to be added :");
	        System.out.println("First Name :");
	        String fn=sc.nextLine();
	        System.out.println("Last Name :");
	        String ln=sc.nextLine();
	        System.out.println("Address :");
	        String ad=sc.nextLine();
	        System.out.println("City :");
	        String city=sc.nextLine();
	        System.out.println("ZipCode :");
	        int zip=sc.nextInt();
	        System.out.println("Phone Number :");
	        long phno=sc.nextLong();
	        System.out.println("Email :");
	        String email=sc.nextLine();
	        sc.nextLine();
	        AddressBook obj1=new AddressBook(fn,ln,ad,city,zip,phno,email);
	        obj.addContact(obj1);
	        break;
			case 2:
				System.out.println("Enter the First Name of the contact you want to edit:");
				String firstNameEdit=sc.nextLine();
				obj.editContactDetails(firstNameEdit);
				System.out.println("Contact details updated SuccessFully.");
				break;
			case 3:
				System.out.println("Enter the First Name of the contact you want to Delete:");
				String firstNameDelete=sc.nextLine();
				obj.deleteContactDetails(firstNameDelete);
				System.out.println("Contact details deleted SuccessFully.");
				break;	
			case 4:
				obj.printContactDetails();
			default:
				System.exit(0);
			}
	    
	    System.out.println("Do you want to enter another contact details, Enter 'Y' for yes and 'N' for not.");
		choice=sc.next().charAt(0);	
		sc.nextLine();
		}
		while(choice=='y' || choice=='Y');
		}
	}


