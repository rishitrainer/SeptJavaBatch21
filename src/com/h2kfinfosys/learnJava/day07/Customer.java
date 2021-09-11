package com.h2kfinfosys.learnJava.day07;

public class Customer {

	private String firstName;
	private String lastName;
	private int age;
	
	public Customer(String firstName) {
		System.out.println("This is Customer Constructor");
	}
	
	public Customer(String fName, String lName, int age) {
		this.firstName = fName;
		this.lastName = lName;
		this.age = age;
		System.out.println("Customer :: " + this.firstName + " " + this.lastName + " Constructed");
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	
	
	public boolean validateAge(int age) {
		if (age > 18) {
			System.out.println("Valid Customer Entry");
			return true;
		}
		return false;
	}
	
	
	
}
