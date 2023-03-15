package com.virtusa.LinkedHashSetEx;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/* Java LinkedHashSet class contains unique elements only like HashSet.
Java LinkedHashSet class provides all optional set operations and permits null elements.
Java LinkedHashSet class is non-synchronized.
Java LinkedHashSet class maintains insertion order.
 * 
 */
public class LinkedHashSetExample {
	public static void main(String[] args) {
         LinkedHashSet<String> books = new LinkedHashSet<>();
         try (Scanner input = new Scanner(System.in)) {
 			System.out.print("how many books elements do you want to add: ");
 			int number = input.nextInt();
 			for (int i = 0; i <= number - 1; i++) {
 				System.out.print("Add Books Element: ");
 				String element = input.next();
 				books.add(element);
 			}
 			System.out.println("LinkedHashSet class maintains insertion order.");
 			System.out.println("Using add() method: " + books);
 			books.add("Maths");
 			System.out.println("Using add() method: " + books);
 			books.remove("Maths");
 			System.out.println("Using remove() method :"+books);
 		    // check size
 			System.out.println("Size is: " + books.size());

 			// Checks if the HashSet is empty
 			System.out.println("Checks if the LinkedHashSet is empty " + books.isEmpty());

 			System.out.println("Display Books : ");
 			Iterator<String> iteration = books.iterator();
 			while (iteration.hasNext()) {
 				System.out.println(iteration.next() + " ");
 			}
 			
 		}
	}

}
