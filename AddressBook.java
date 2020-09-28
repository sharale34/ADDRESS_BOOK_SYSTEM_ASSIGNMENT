package com.bridgelabz.Contact;

public class AddressBook {
	 String firstName ;
	 String lastName ;
	 String address;
	 String city;
	 int zip;
	 long phoneNum;
	 String email;
	
	//parameterized constructor
	public AddressBook(String firstName , String lastName , String address , String city , int zip , long phoneNum , String email)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.zip=zip;
		this.phoneNum=phoneNum;
		this.email=email;
	}
	//generating getters and setters
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getZip() {
		return zip;
	}


	public void setZip(int zip) {
		this.zip = zip;
	}


	public long getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
}


