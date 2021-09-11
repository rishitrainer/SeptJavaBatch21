package com.h2kfinfosys.learnJava.day08;

import java.io.Serializable;
// Interfaces can extend other interfaces and follows multiple inheritance 
public interface Reachable extends Serializable, Comparable<Employee> {

	// Variables in INTEFACE are always public static final 
	String country_code = "US";
	
	// methods - public abstract
	boolean validateAddress(String address);
	boolean validateEmail(String email);
	
	
}
