package com.h2kfinfosys.learnJava.day07;

public class Parent {
	// Inheritance - CHild class has access to Parent Class Props and methods
	public Parent() {
		
	}
	
	private String privateString = "Private Variable";
	public String publictString = "Public String";
	String defaultString = "DefaultString";
	protected String protectedString = "Protected String";
	
	public void simpleParentMethod() {
		System.out.println("This public method is accessible");
	}
	
	void simpleDefaultMethod() {
		System.out.println("This Default method is accessible");
	}
	
	protected void simpleProtectedMethod() {
		System.out.println("This Protected method is accessible");
	}
	
	private void simplePrivateMethod() {
		System.out.println("This private method is accessible");
	}

}
