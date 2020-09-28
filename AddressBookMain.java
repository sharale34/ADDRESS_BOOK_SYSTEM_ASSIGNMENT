package com.bridgelabz.Contact;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		//creating object and assigning values to variables
	    Scanner sc = new Scanner(System.in);
	    Contact obj = new Contact();
	    char choice=' ';
	    do {	
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
	        
	    System.out.println("Do you want to enter another contact details, Enter 'Y' for yes and 'N' for not.");
		choice=sc.next().charAt(0);	
		sc.nextLine();
		}
		while(choice=='y' || choice=='Y');
		}

	
	}


