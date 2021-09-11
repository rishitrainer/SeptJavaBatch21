package com.h2kfinfosys.learnJava.day05;

public class ForEachLoop {

	public static void main(String[] args) {
		int[] marks = {97,88,93,94,76,99};
		
		/*
		 * for(int eachElement: Collection){
		 * 	block of code for eachElement
		 * }
		 */
		int total_marks = 0;
		for(int eachMarks : marks) {
			if(eachMarks < 80) {
				System.out.println("Marks less than 80, get out of loop");
				continue;
			}
			System.out.println(eachMarks);
			total_marks = total_marks + eachMarks;
		}
		System.out.println("Total Marks" + total_marks);

	}

}
