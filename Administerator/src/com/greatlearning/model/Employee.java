package com.greatlearning.model;

public class Employee {

	public String firstName;
	public String lastName;
	public String department;

	public Employee(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lastname) {
		this.firstName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}

}
