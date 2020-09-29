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
     public void addContact(AddressBook contactObj)
     {
    	 address.add(contactObj);
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
     public void deleteContactDetails(String firstNameDelete) {
  		int i=0;
  		for(AddressBook c:address){
  			if((c.getFirstName()).equals(firstNameDelete))
  			{
  				address.remove(i+1);
  				break;
  			}
  			i+=1;
  		}
  	}
  	public void printContactDetails() {
  		for(AddressBook c:address){
  			System.out.println("First name: "+c.getFirstName()+" Last name: "+c.getLastName()+" Address: "+c.getAddress()+" City Name: "+c.getCity()+" Zip Number: "+c.getZip()+" Phone Number: "+c.getPhoneNum()+" Email Id: "+c.getEmail());
  		}
  	}
}
