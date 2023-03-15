package com.virtusa.PriorityEx;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityEx {
	public static void main(String[] args) {

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("how many elements do you want to add: ");
			int number = input.nextInt();
			for (int i = 0; i <= number - 1; i++) {
				int element = input.nextInt();
				queue.add(element);
			}

			// Print the head element using Peek () method
			System.out.println("Head element using peek method:" + queue.peek());
		}

		// Printing all elements
		System.out.println("The PriorityQueue elements: ");

		Iterator<Integer> iteration = queue.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next() + " ");
		}

		// remove head with poll ()
		queue.poll();

		// Printing all elements
		System.out.println("After PriorityQueue elements: ");
		Iterator<Integer> iteration1 = queue.iterator();
		while (iteration1.hasNext()) {
			System.out.println(iteration1.next() + " ");
		}

		queue.add(10);
		queue.add(100);
		queue.remove(100);
		System.out.println("After PriorityQueue remove() elements: ");
		Iterator<Integer> iteration2 = queue.iterator();
		while (iteration2.hasNext()) {
			System.out.println(iteration2.next() + " ");
		}

		// Check if an element is present in PriorityQueue using contains()
		boolean val = queue.contains(10);
		System.out.println(val);

		// get array equivalent of PriorityQueue with toArray ()
		Object num[] = queue.toArray();
		System.out.println("\nArray Contents: ");
		for (int i = 0; i < num.length; i++)
			System.out.println(num[i].toString() + " ");
		
		

	}

}
