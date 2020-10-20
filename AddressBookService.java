package com.bridgelabz.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookService {

	private static Scanner SC = new Scanner(System.in);
	static List<Contact> contactList;

	public enum addressBookEnum {
		FILE_IO, CONSOLE_IO;
	}

	public AddressBookService() {
	}

	public AddressBookService(ArrayList<Contact> contactList) {
		AddressBookService.contactList = contactList;
	}

	public static void main(String[] args) {
		AddressBookService addressBook = new AddressBookService();
		int choice = 0;
		do {
			System.out.println("Select from Menu! \n1 : Add contact Details \n2 : Veiw contact Details \n3 : Exit");
			choice = SC.nextInt();
			switch (choice) {
			case 1:
				write(addressBookEnum.FILE_IO);
				break;
			case 2:
				addressBook.readContactDetails(addressBookEnum.FILE_IO);
				break;
			}
		} while (choice != 3);
	}

	private static void write(addressBookEnum fileIo) {
		ArrayList<Contact> contactList = new ArrayList<>();
		Contact[] arrayOfContacts = {
				new Contact("Sourabh", "Harale", "Gandhari", "Hyderabad", 503114, 949411827, "hsourabh@gmail.com"),
				new Contact("Dheeraj", "Harale", "Kamareddy", "Hyderabad", 503114, 720702046, "dheeraj@gmail.com") };
		for (Contact contact : arrayOfContacts) {
			contactList.add(contact);
		}
		AddressBookService addressBook = new AddressBookService(contactList);
		if (fileIo.equals(addressBookEnum.FILE_IO))
			new AddressBookFileIOService().writeContactToFile(contactList);
	}

	private void readContactDetails(addressBookEnum fileIo) {
		if (fileIo.equals(addressBookEnum.FILE_IO))
			new AddressBookFileIOService().readData(contactList);
	}
}
