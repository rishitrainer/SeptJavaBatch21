package com.h2kfinfosys.learnJava.day09;

import java.util.ArrayDeque;

public class DequeTest {

	public static void main(String[] args) {
		ArrayDeque<String> dequeTest = new ArrayDeque<String>();
		dequeTest.offerFirst("First");
		dequeTest.offerLast("Last");
	}

}
