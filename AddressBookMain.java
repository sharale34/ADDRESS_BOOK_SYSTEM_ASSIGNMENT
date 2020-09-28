package com.bridgelabz.Contact;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		//creating object and assigning values to variables
	    AddressBook obj = new AddressBook("Sourabh","Harale","kmr","hyd",503114,949400,"xyz@gamil.com");
	    //printing the output
	    System.out.println("First Name :"+obj.firstName);
	    System.out.println("Last Name :"+obj.lastName);
	    System.out.println("Address :"+obj.address);
	    System.out.println("City :"+obj.city);
	    System.out.println("ZipCode :"+obj.zip);
	    System.out.println("Phone Number :"+obj.phoneNum);
	    System.out.println("Email :"+obj.email);
	}

}
