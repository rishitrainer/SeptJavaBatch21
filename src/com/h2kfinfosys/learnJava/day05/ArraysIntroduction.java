package com.h2kfinfosys.learnJava.day05;

public class ArraysIntroduction {

	public static void main(String[] args) {
		// Array - Collection of Homogeneous elements
		int marks_01 = 97;
		int marks_02 = 88;
		
		// integer array 
		int[] marks = {97,88,93,94,76,99};
		System.out.println(marks);
		System.out.println(marks[0]);
		System.out.println(marks[4]);
		
		int max_index = marks.length;
		// for(initialization, condition, increment)
		int totalMarks = 0;
		for(int index = 0; index < max_index; index++) {
			totalMarks = totalMarks + marks[index];
		}
		System.out.println("Total Marks" + totalMarks);
	
		

	}

}
