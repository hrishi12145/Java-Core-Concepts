package com.virtusa.HashSetEx;
/*HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.
 * 
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetEx {
	public static void main(String[] args) {

		HashSet<String> forest = new HashSet<>();

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("how many Animal elements do you want to add in forest: ");
			int number = input.nextInt();
			for (int i = 0; i <= number - 1; i++) {
				System.out.print("Add Animal : ");
				String animals = input.next();
				forest.add(animals);
			}
		}

		System.out.println("Using add() method: " + forest);
		// Returns true if this set contains the specified element.
		boolean animalExitsOrNOt = forest.contains("Lion");
		System.out.println("check Animal exits or not using contains(): " + animalExitsOrNOt);

		// check size
		System.out.println("Size is: " + forest.size());

		// Checks if the HashSet is empty
		System.out.println("Checks if the HashSet is empty " + forest.isEmpty());

		System.out.println("Display Animals in the forest: ");
		Iterator<String> iteration = forest.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next() + " ");
		}
	}

}
