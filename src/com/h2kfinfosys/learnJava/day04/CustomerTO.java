package com.h2kfinfosys.learnJava.day04;


public class CustomerTO {
	// Instance Variable
	String firstName;
	String lastName;
	int custId;
	
	// Static Variables
	static String companyName = "Best Buy Inc.";
	
	public static void main(String[] args) {
		// Local Variables
		String testVariable = "Some Value";
		// ClassName instanceName = new ClassName()
		CustomerTO custOne = new CustomerTO();
		custOne.custId = 100;
		custOne.firstName = "Niel";
		custOne.lastName = "Armstrong";
		/// The static field CustomerTO.companyName should be accessed in a static way
		CustomerTO.companyName = "Walmart Inc.";
		
		CustomerTO custTwo = new CustomerTO();
		custTwo.custId = 200;
		custTwo.firstName = "Buzz";
		custTwo.lastName = "Aldrine";
		
		System.out.println(custOne.custId + " " + custOne.firstName);
		System.out.println(custTwo.custId + " " + custTwo.firstName);
		System.out.println(CustomerTO.companyName);
		System.out.println(testVariable);
	}

}
