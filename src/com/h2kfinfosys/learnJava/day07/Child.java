package com.h2kfinfosys.learnJava.day07;
/**
 * extends - For creating Child class
 * You cannot extend more than one class - Single Inheritance 
 * @author Rishi
 *
 */
public class Child extends Parent{
	
	// Protected = default + child
	
	public void simpleAccessorMethod() {
		// Private members are not accessible in Child Class.
		// System.out.println(privateString);
		System.out.println(publictString);
		System.out.println(defaultString);
		System.out.println(protectedString);
	}
	
	public static void main(String[] args) {
		Child childInstance = new Child();
		childInstance.simpleAccessorMethod();
		childInstance.simpleParentMethod();
		childInstance.simpleDefaultMethod();
		childInstance.simpleProtectedMethod();
		// childInstance.simplePrivateMethod();
	}

}
