package com.h2kfinfosys.learnJava.day06;

import com.h2kfinfosys.learnJava.day07.Child;
import com.h2kfinfosys.learnJava.day07.Parent;

public class OutOfPackageChild extends Parent{
	
	public void simpleAccessorMethod() {
		// Private members are not accessible in Child Class.
		// System.out.println(privateString);
		System.out.println(publictString);
		// Outside the Package
		// System.out.println(defaultString);
		System.out.println(protectedString);
		// Protected methods are accessible within Child Class 
		// Not to instance created outside the package
		simpleProtectedMethod();
	}
	
	public static void main(String[] args) {
		Child childInstance = new Child();
		childInstance.simpleAccessorMethod();
		childInstance.simpleParentMethod();
		// childInstance.simpleDefaultMethod();
		// childInstance.simplePrivateMethod();
	}

}
