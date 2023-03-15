package com.virtusa.TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {

		Set<Books> treeSet = new TreeSet<>(Comparator.comparing(Books::getBookId));

		Books book1 = new Books(4, "Java", 1200);
		Books book2 = new Books(3, "Python", 1800);
		Books book3 = new Books(2, "JavaScript", 2200);
		Books book4 = new Books(1, "Go", 1200);

		treeSet.add(book1);
		treeSet.add(book2);
		treeSet.add(book3);
		treeSet.add(book4);

		System.out.println("Displaying in Assending order by using BookID: ");

		Iterator<Books> iteration = treeSet.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next() + " ");
		}

	}

}
