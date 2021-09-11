package com.h2kfinfosys.learnJava.day07;
// Child of PreferredCustomer - CreditCard Customer
public class PreferredCustomer extends Customer{
	
	public PreferredCustomer() {
		super("John Doe");// implicit - for no-arg constructor only
		System.out.println("This is PreferredCustomer Constructor");
	}
	
	private String email;
	
	
	public void processPromotions() {
		System.out.println("Promotions are sent to " + this.email);
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
