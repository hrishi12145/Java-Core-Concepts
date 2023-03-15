package com.virtusa.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		TreeMap<Person, String> treeMap = new TreeMap<>();

		Person person1 = new Person();
		person1.setAadharNo(1);
		person1.setName("Ram");
		person1.setCity("Mumbai");

		Person person2 = new Person(2, "Aditya", "Pune");

		Person person3 = new Person(3, "Aashish", "Banglore");

		treeMap.put(person1, "first");
		treeMap.put(person2, "Second");
		treeMap.put(person3, "Third");

		// Getting a Set of Key-value pairs
		Set entrySet = treeMap.entrySet();

		// Obtaining an iterator for the entry set
		Iterator it = entrySet.iterator();

		// Iterate through HashMap entries(Key-Value pairs)
		System.out.println("TreeMap Key-Value Pairs : ");
		while (it.hasNext()) {
			Map.Entry details = (Map.Entry) it.next();
			System.out.println("Key is: " + details.getKey() + " & " + " value is: " + details.getValue());
		}

	}

}
