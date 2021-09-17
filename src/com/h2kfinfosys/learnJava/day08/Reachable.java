package com.h2kfinfosys.learnJava.day08;

import java.io.Serializable;
// Interfaces can extend other interfaces and follows multiple inheritance 
public interface Reachable extends Serializable, Comparable<Employee> {

	// Variables in INTEFACE are always public static final 
	String country_code = "US";
	
	// methods - public abstract
	boolean validateAddress(String address);
	boolean validateEmail(String email);
	
	private void testThisMethod() {
		System.out.println("This kind of methods are now allowed");
	}
	// default is for default implementation of method and not as package access
	default void testDefaultmethod() {
		testThisMethod();
		System.out.println("This is Default Logic for test method");
	}
	
	
}
