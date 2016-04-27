package com.webfrequency.geekcommerce.domain;

public class Customer {

	private int customerId;
	private String fName;
	private String lName;
	private String address;
	private String emailAddress;
	private String phoneNumber;
	private int numOfOrdersMade;
	
	public Customer() {
		super();
	}

	public Customer(int customerId, String fName, String lName, String address, String emailAddress, String phoneNumber,
			int numOfOrdersMade) {
	
		this.customerId = customerId;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.numOfOrdersMade = numOfOrdersMade;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getNumOfOrdersMade() {
		return numOfOrdersMade;
	}

	public void setNumOfOrdersMade(int numOfOrdersMade) {
		this.numOfOrdersMade = numOfOrdersMade;
	}
}
