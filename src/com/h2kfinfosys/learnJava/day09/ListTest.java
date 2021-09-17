package com.h2kfinfosys.learnJava.day09;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		int[] marks = {12,13,14,15};
		// Index - Order - FIFO
		// ArrayList - Random Access Indexed collection- 
		// LinkedList - Order of insertion
		ArrayList<String> testArrayList = new ArrayList<String>();
		// add
		testArrayList.add("A");
		testArrayList.add(1, "B");
		testArrayList.add("C");
		testArrayList.add("C");
		testArrayList.add("C");
		testArrayList.add("D");
		testArrayList.add(2,"E");
		System.out.println("Test List Data :: " + testArrayList);
		// access the value
		System.out.println(testArrayList.get(0));
		
		System.out.println("Size :: " + testArrayList.size());
		// remove
		testArrayList.remove("E");
		testArrayList.remove(0);
		System.out.println("Test List Data :: " + testArrayList);
		// membership
		if (testArrayList.contains("D")) {
			System.out.println("D is available");
		}
			
		// Iterate
		for (String eachValue : testArrayList) {
			System.out.println(eachValue);
		}
		// clear
		testArrayList.clear();
		System.out.println("Test List Data :: " + testArrayList);
		
		
		// Can you add methods for LinkedList?
		
	}

}
