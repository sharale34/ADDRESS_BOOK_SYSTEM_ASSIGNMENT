package com.bridgelabz.Contact;

import java.util.ArrayList;

public class AddressBook {
	private ArrayList<Contact> addressBook = new ArrayList<Contact>();

	public ArrayList<Contact> getAddressBook() {
		return this.addressBook;
	}

	public void setAddressBook(ArrayList<Contact> addressBook) {
		this.addressBook = addressBook;
	}

	public void addContactToAddressBook(Contact contact) {
		addressBook.add(contact);
	}

	public Contact editContact(String firstName, String lastName) {
		Contact contactSearch = null;
		for (Contact contact : addressBook) {
			if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
				contactSearch = contact;
				break;
			}
		}

		return contactSearch;
	}

	public boolean removeContact(String firstName, String lastName) {
		boolean remove = false;
		for (Contact contact : addressBook) {
			if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
				addressBook.remove(contact);
				remove = true;
				break;
			}
		}
		return remove;
	}

	public boolean checkDuplicateContact(String firstName, String lastName) {
		boolean duplicate = false;
		for (Contact c : addressBook) {
			if ((c.getFirstName()).equals(firstName) && (c.getLastName()).equals(lastName)) {
				duplicate = true;
				break;
			}
		}
		return duplicate;
	}

	public void printContactDetails() {
		for (Contact c : addressBook) {
			System.out.println("First name: " + c.getFirstName() + " Last name: " + c.getLastName() + " Address: "
					+ c.getAddress() + " City Name: " + c.getCityName() + " Zip Number: " + c.getZipNumber()
					+ " Phone Number: " + c.getPhoneNumber() + " Email Id: " + c.getEmailId());
		}
	}
}
