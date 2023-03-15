package com.virtusa.TreeMap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
 
		TreeMap<Books, String> treeMap = new TreeMap<>(Comparator.comparing(Books::getBookId));

		Books book1 = new Books(4, "Java", 1200);
		Books book2 = new Books(3, "Python", 1800);
		Books book3 = new Books(2, "JavaScript", 2200);
		Books book4 = new Books(1, "Go", 1200);

		treeMap.put(book1, "Java");
		treeMap.put(book2, "Python");
		treeMap.put(book3, "JavaScrpt");
		treeMap.put(book4, "Go");

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
