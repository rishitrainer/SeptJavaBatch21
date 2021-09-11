package com.h2kfinfosys.learnJava.day07;

public class Tester {

	public static void main(String[] args) {
		PreferredCustomer pCust = new PreferredCustomer();
		pCust.setFirstName("David");
		pCust.setLastName("Brown");
		pCust.setAge(45);
		pCust.setEmail("David.brown@nasa.com");
		pCust.validateAge(45);
		pCust.processPromotions();
	}

}
