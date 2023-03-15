package com.virtusa.Collections.StreamEx;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class FindNoStartsWith1 {

	public static void main(String[] args) {

		ArrayList<Integer> listOfNumbers = new ArrayList<>();

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("how many String elements do you want to add: ");
			int number = input.nextInt();
			for (int i = 0; i <= number - 1; i++) {
				System.out.print("Add String Element: ");
				int element = input.nextInt();
				listOfNumbers.add(element);
			}
			System.out.println("Orignial List -");
			System.out.println(listOfNumbers);
			System.out.println();
			
			Stream<String> startWith1=listOfNumbers.stream().map(n-> n +"").filter(n-> n.startsWith("1"));

			System.out.println("Numbers startWith1 from original list");
			startWith1.forEach(x-> System.out.println(x));
		}

	}
}