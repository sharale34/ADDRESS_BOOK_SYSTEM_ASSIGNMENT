package com.bridgelabz.Contact;

import java.util.ArrayList;

public class Contact {
	private ArrayList<AddressBook> address=new ArrayList<AddressBook>();

	public ArrayList<AddressBook> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<AddressBook> address) {
		this.address = address;
	}
     public void addContact(AddressBook cobj)
     {
    	 address.add(cobj);
     }
}
