package com.virtusa.VectorEx;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/* vector is a legacy class
 * It is Synchronized i.e why it is slow
 * vector uses Enumeration interface to traverse the elements but it can use iterator also 
 */
public class VectorExample {
	public static void main(String[] args) {
		Vector<String> fruitStore = new Vector<>();
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("how many Fruits elements do you want to add: ");
			int number = input.nextInt();
			for (int i = 0; i <= number - 1; i++) {
				System.out.println("Add Fruit Element: ");
				String element = input.next();
				fruitStore.add(element);
			}
		}
		System.out.println("Using add() method: " +fruitStore);
		// check size and increment Capacity
		System.out.println("Size is: "+fruitStore.size());
		System.out.println("Default Capacity increment is: "+fruitStore.capacity());
		
		fruitStore.addElement("PineApple");
		fruitStore.addElement("Apple");
		// check size and increment Capacity after 2 insertion
		System.out.println("check size and increment Capacity after 2 insertion");
		System.out.println("Size is: "+fruitStore.size());
		System.out.println("Default Capacity increment is: "+fruitStore.capacity());
		
		System.out.println("Display Vector elements: ");
		Iterator<String> iteration = fruitStore.iterator();
		while(iteration.hasNext()) {
			System.out.println(iteration.next()+" ");
		}
		
	}
}
