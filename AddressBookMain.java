package com.bridgelabz.Contact;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		// Display Welcome Message
		System.out.println("Welcome to Address Book Program");

		Scanner sc = new Scanner(System.in);

		// Instantiation of AddressBookDictionary Class
		AddressBookDictionary addressBookDictionary = new AddressBookDictionary();

		while (true) {
			System.out.println("Please Select From Menu: \n1. Add New Address Book \n2. Exit:");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("Enter the Address Book Name : ");
				sc.nextLine();
				String addressBookName = sc.nextLine();

				// Instantiation of AddressBook Class
				AddressBook addressBookObj = new AddressBook();

				addressBookDictionary.addAddressBook(addressBookName, addressBookObj);

				int option = 0;

				do {

					System.out.println(
							"Please Select From Menu: \n1 : Add Contact to Address Book\n2 : Update Existing Contact\n3 : Remove Contact"
									+ "\n4 : Search details of a Contact \n5 : Print contact details\n6. Exit");
					option = sc.nextInt();

					switch (option) {
					// To Take Console Input for Contact Details
					case 1:
						System.out.println("Enter First Name : ");
						String firstName = sc.next();
						System.out.println("Enter Last Name : ");
						String lastName = sc.next();
						sc.nextLine();
						System.out.println("Enter Address : ");
						String address = sc.nextLine();
						System.out.println("Enter City : ");
						String city = sc.nextLine();
						System.out.println("Enter Zip Code: ");
						int zipCode = sc.nextInt();
						System.out.println("Enter Phone Number : ");
						Long phoneNo = sc.nextLong();
						System.out.println("Enter Email ID : ");
						String email = sc.next();
						boolean duplicate = addressBookObj.checkDuplicateContact(firstName, lastName);
						if (duplicate == true) {
							System.out.println("Duplicate Entry. Try Again");
						} else {
							// Instantiation of Contact Class
							Contact contactObj = new Contact(firstName, lastName, address, city, zipCode, phoneNo,
									email);
							// Add New Contact into Address Book
							addressBookObj.addContactToAddressBook(contactObj);
						}
						break;

					case 2: // Console input to take First and Last Names to Update Contact
						System.out.println("Enter your First Name to Edit your Contact : ");
						String firstNameEdit = sc.next();
						System.out.println("Enter your Second Name to Edit your Contact : ");
						String lastNameEdit = sc.next();

						// Updating Contact
						Contact contactEdited = addressBookObj.editContact(firstNameEdit, lastNameEdit);
						if (contactEdited == null) {
							System.out.println("Contact Not Available. Please try Again");
						} else {

							System.out.println(
									"Select the Option you want to Update\n1 : First Name\n2 : Last Name\n3 : Address\n"
											+ "4 : City\n5 : Zip\n6 : Phone Number\n7 : Email\nSelect :");
							int choice = sc.nextInt();

							switch (choice) {
							case 1:
								System.out.println("Enter the new First Name to Update : ");
								String newFirstName = sc.next();
								contactEdited.setFirstName(newFirstName);
								break;
							case 2:
								System.out.println("Enter the new Last Name to Update : ");
								String newLastName = sc.next();
								contactEdited.setLastName(newLastName);
								break;
							case 3:
								System.out.println("Enter the new Address to Update : ");
								sc.nextLine();
								String newAddress = sc.nextLine();
								contactEdited.setAddress(newAddress);
								break;
							case 4:
								System.out.println("Enter the new City to Update : ");
								sc.nextLine();
								String newCity = sc.nextLine();
								contactEdited.setCityName(newCity);
								break;
							case 6:
								System.out.println("Enter the new Zip to Update : ");
								int newZip = sc.nextInt();
								contactEdited.setZipNumber(newZip);
								break;
							case 7:
								System.out.println("Enter the new Phone Number to Update : ");
								Long newPhoneNo = sc.nextLong();
								contactEdited.setPhoneNumber(newPhoneNo);
								break;
							case 8:
								System.out.println("Enter the new Email to Update : ");
								String newEmail = sc.next();
								contactEdited.setEmailId(newEmail);
								break;
							default:
								System.out.println("Enter Valid Number");
								break;
							}
						}
						break;

					case 3: // Console input to take First and Last Names to Remove Contact
						System.out.println("Enter your First Name of Contact : ");
						String removeFirstName = sc.next();
						System.out.println("Enter your Last Name to Contact : ");
						String removeLastName = sc.next();
						boolean remove = addressBookObj.removeContact(removeFirstName, removeLastName);
						if (remove)
							System.out.println("Contact Sucessfully Removed");
						else
							System.out.println("Contact not Available. Please Try Again!");
						break;

					case 4:
						System.out.println("Enter your First Name of Contact : ");
						String firstNameSearch = sc.next();
						System.out.println("Enter your Last Name to Contact : ");
						String lastNameSearch = sc.next();
						addressBookObj.searchContactDetails(firstNameSearch, lastNameSearch);

					case 5:
						addressBookObj.printContactDetails();
						break;
					default:
						break;
					}
				} while (option != 6);
			} else
				System.exit(0);
		}
	}
}
