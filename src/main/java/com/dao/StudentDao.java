package com.dao;

public class StudentDao {

	String firstName;
	int age;
	AddressDao address;

	public StudentDao(AddressDao a) {
		address = a;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AddressDao getAddress() {
		return address;
	}

	public void setAddress(AddressDao address) {
		this.address = address;
	}

}
