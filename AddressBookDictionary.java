package com.bridgelabz.Contact;

import java.util.HashMap;

public class AddressBookDictionary {
	private HashMap<String, AddressBook> addressBookDictionary = new HashMap<String, AddressBook>();

	public HashMap<String, AddressBook> getAddressBookDictionary() {
		return this.addressBookDictionary;
	}

	public void setAddressBookDictionary(HashMap<String, AddressBook> addressBookDictionary) {
		this.addressBookDictionary = addressBookDictionary;
	}

	public void addAddressBook(String name, AddressBook addressBook) {
		addressBookDictionary.put(name, addressBook);
	}
}
