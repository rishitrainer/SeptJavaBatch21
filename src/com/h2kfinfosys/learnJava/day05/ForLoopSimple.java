package com.h2kfinfosys.learnJava.day05;

public class ForLoopSimple {

	public static void main(String[] args) {
		/*
		 * start
		 * stop
		 * step
		 * for(initialization, condition, increment)
		 */
		int sample = 100;
		// ++ after variable : Use the value then increase
		// ++ before the variable : Increase the value then Use
		System.out.println("Check the value of sample " + (++sample) );
		System.out.println("Actual Value of sample :: " + sample);
		
		
		int total = 0;
		for(int counter = 1; counter <=10; counter++) {
			//System.out.println("Counter Value" + counter);
			total = total + counter;
		}
		System.out.println("Total " + total);
	}

}
