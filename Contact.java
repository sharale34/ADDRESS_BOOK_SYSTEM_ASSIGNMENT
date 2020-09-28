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
     public void editContactDetails(String firstNameEdit){
     	 //List<Contact> editedContact=new ArrayList<Contact>();
     		int i=0;
     		for(AddressBook c:address){
     			if((c.getFirstName()).equals(firstNameEdit))
     			{
     				AddressBook contactObj=new AddressBook(c.getFirstName(),c.getLastName(),c.getAddress(),c.getCity(),c.getZip(),c.getPhoneNum(),c.getEmail());
     				address.set(i+1, contactObj);
     				break;
     			}
     			i+=1;
     		}
     	}
}
