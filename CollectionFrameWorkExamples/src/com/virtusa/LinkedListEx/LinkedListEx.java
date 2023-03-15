package com.virtusa.LinkedListEx;

import java.util.LinkedList;
import java.util.Scanner;

/* 
Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.
 * 
 */
public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> books = new LinkedList<>();
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("how many books elements do you want to add: ");
			int number = input.nextInt();
			for (int i = 0; i <= number - 1; i++) {
				System.out.print("Add Books Element: ");
				String element = input.next();
				books.add(element);
			}
		}
		System.out.println("Using add() method: " + books);
		// Add first and last elements
		books.addFirst("Maths1");
		books.addLast("Maths2");
		System.out.println("Using addFirst() & addLast() method: " + books);
		// Get and Set values using method
		String firstBook = books.get(0);
		System.out.println("Using get(index) : " + firstBook);
		books.set(0, "M4");
		System.out.println("After updating Using set(index): " + books);

		// getFirst() Get the item at the beginning of the list
		String getFirstBook = books.getFirst();
		// getLast() Get the item at the end of the list
		String getLastBook = books.getLast();
		System.out.println("getFirst() :" + getFirstBook);
		System.out.println("getLast() :" + getLastBook);
		// removeFirst() Remove an item from the beginning of the list.
		String removeFirstBook = books.removeFirst();
		// removeLast() remove last element from list
		String removeLastBook = books.removeLast();
		System.out.println("removeFirst() :" + removeFirstBook);
		System.out.println("removeLast() :" + removeLastBook);

		// Display Books
		System.out.println("Books : " + books);

	}
}
