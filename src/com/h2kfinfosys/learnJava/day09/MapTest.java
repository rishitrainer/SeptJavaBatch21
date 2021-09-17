package com.h2kfinfosys.learnJava.day09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		HashMap<Integer, String> testHashMap2 = new HashMap<Integer, String>();
		// add
		testHashMap2.put(400, "Amy Watson");
		testHashMap2.put(500, "Paul Bulson");
		testHashMap2.put(300, "David Patterson");
		// Key - Value
		HashMap<Integer, String> testHashMap = new HashMap<Integer, String>();
		// add
		testHashMap.put(100, "Neil Armstrong");
		testHashMap.put(200, "Buzz Aldrine");
		testHashMap.put(300, "Peter Burrow");
		System.out.println(testHashMap);
		testHashMap.put(200, "Spark Aldrine"); // Update Map 
		System.out.println(testHashMap);
		// get
		
		System.out.println(testHashMap.get(100));
		
		// remove
		System.out.println(testHashMap.remove(300));
		System.out.println(testHashMap);
		// size
		System.out.println(testHashMap.size());
		// iterate
		Set<Integer> keySet = testHashMap.keySet();
		for(int eachKey : keySet) {
			System.out.println(eachKey + " " + testHashMap.get(eachKey));
		}
		
		Collection<String> values = testHashMap.values();
		for (String eachValue : values) {
			System.out.println(eachValue);
		}
		
		Set<Map.Entry<Integer,String>> MapEntries = testHashMap.entrySet();
		for (Map.Entry<Integer,String> eachEntry :  MapEntries) {
			System.out.println(eachEntry);
		}
		
		// membership
		if(testHashMap.containsKey(300)) {
			System.out.println("300 Exists");
		}else {
			System.out.println("300 NOT Exists");
		}
		
		if(testHashMap.containsValue("Neil Armstrong")) {
			System.out.println("Neil Armstrong Exists");
		}else {
			System.out.println("Neil Armstrong NOT Exists");
		}
		
		testHashMap.putAll(testHashMap2);
		System.out.println(testHashMap);

	}

}
