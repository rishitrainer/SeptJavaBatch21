package com.h2kfinfosys.learnJava.day09;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// Not ordered, no index - maintains unique
		HashSet<String> hashSet = new HashSet<String>();
		// Hash - Speed (hash table)
		TreeSet<String> treeSet = new TreeSet<String>(); // default ascending order
		// LinkedHashSet
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		linkedHashSet.add("X");
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("R");
		linkedHashSet.add("R"); // not getting added
		linkedHashSet.add("R");
		
		linkedHashSet.remove(linkedHashSet);
		
		linkedHashSet.contains("A");
		
		linkedHashSet.clear();
		
		for (String eachValue : linkedHashSet) {
			System.out.println(eachValue);
		}
		
		System.out.println(linkedHashSet.size());
		
		System.out.println(linkedHashSet.isEmpty());

	}

}
