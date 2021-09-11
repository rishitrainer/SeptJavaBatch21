package com.h2kfinfosys.learnJava.day01;

public class HelloWorld {

	// Comments in Java - Single line comment
	/*
	 * This is called multi line
	 * comment
	 * Any number of lines
	 */
	// Variables - Size / type
	// Statically typed programming 
	// 8 Primitive data types 

	// DataType variableName = value
	byte byteTest = 99; // 128 - 121
	Byte byteWrapper = 127;
	short shortData = 9999;
	int intData = 999999999;
	long longData = 99999999999999l;
	
	// decimal 
	float floatData = 99.14493598435f;
	double doubleData = 99.99d;
	
	// boolean
	boolean boolData = false; // true
	
	// Character
	char char_Data = 'A'; // Single Character in single quotes
	
	// String 
	String name = "Any length of Data";
	
	int age21 = 21;
	
	/*
	 * 1. they can carry numbers - start with alphabets
	 * 2. No special Characters except _
	 * 3. Length 256 chara - camelCase 
	 */

	public static void main(String[] args) {
		System.out.println("Byte Data "+ Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
		System.out.println("Short Data "+ Short.MAX_VALUE + " " + Short.MIN_VALUE);
		System.out.println("Integer Data "+ Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
		System.out.println("Long Data "+ Long.MAX_VALUE + " " + Long.MIN_VALUE);
		System.out.println("Float Data "+ Float.MAX_VALUE + " " + Float.MIN_VALUE);
		System.out.println("Double Data "+ Double.MAX_VALUE + " " + Double.MIN_VALUE);
		System.out.println("Boolean Data "+ Boolean.TRUE + " " + Boolean.FALSE);
	//	System.out.println("Character Data "+ Character.MAX_VALUE + " " + Character.MIN_VALUE);
		
	}
	
	// Functions - methods
}

