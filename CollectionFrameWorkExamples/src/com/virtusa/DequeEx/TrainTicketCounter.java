package com.virtusa.DequeEx;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class TrainTicketCounter {

	public static void main(String[] args) {

		Deque<String> queue = new ArrayDeque<String>();

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("how many elements do you want to add: ");
			int number = input.nextInt();
			for (int i = 0; i <= number - 1; i++) {
				String element = input.next();
				queue.add(element);
			}
		}

		queue.addFirst("Hrishi");
		queue.addLast("Lotekar");

		System.out.println("Using contains(): check Hrishi is present or not " + queue.contains("Hrishi"));
		System.out.println();
		System.out.println("getFirst() : " + queue.getFirst());
		System.out.println("getLast() : " + queue.getLast());
		System.out.println();
		System.out.println("Check Size " + queue.size());
		System.out.println();
		// Returns the first element of Deque, or null if the Deque is empty.
		System.out.println("peekfirst() : " + queue.peekFirst());
		// Returns the Last element of Deque, or null if the Deque is empty.
		System.out.println("peekLast(): " + queue.peekLast());

		System.out.println();
		// Printing all elements
		System.out.println("The DeQueue elements: ");

		Iterator<String> iteration = queue.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next() + " ");
		}

	}

}