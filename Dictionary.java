package com.bridgelabz.Contact;
import java.util.HashMap;
public class Dictionary {
	private HashMap<String, AddressBook> Dictionary=new HashMap<>();

	public HashMap<String, AddressBook> getDictionary() {
		return Dictionary;
	}

	public void setDictionary(HashMap<String, AddressBook> dictionary) {
		Dictionary = dictionary;
	}
	public void addAddressBook(String addressBookName, AddressBook contactObj) {
		Dictionary.put(addressBookName, contactObj);
	}
}
