package com.virtusa.Enumarator_IteratorEx;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Enumerator_Iterator {
	@SuppressWarnings("rawtypes")
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

		fruitStore.addElement("PineApple");
		System.out.println("Display Vector elements using Iterator ");
		Iterator<String> iteration = fruitStore.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next() + " ");
		}

		iteration.remove();
		System.out.println();
		System.out.println("Display Vector elements after Iterator has removed the last element: ");
		Iterator<String> iteration1 = fruitStore.iterator();
		while (iteration1.hasNext()) {
			System.out.println(iteration1.next() + " ");
		}

		System.out.println();
		System.out.println("iterator can modify the elements. ");
		System.out.println();
		Enumeration en = fruitStore.elements();

		/*
		 * Display Vector elements using hashMoreElements() and nextElement() methods.
		 */
		System.out.println("Vector elements after using Enumeration: ");
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println();
		System.out.println("Enumerator can not modify the elements. ");
	}
}