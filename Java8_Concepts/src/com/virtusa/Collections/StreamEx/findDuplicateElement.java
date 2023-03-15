package com.virtusa.Collections.StreamEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class findDuplicateElement {

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

			HashSet<Integer> hashSet = new HashSet<>();

			List<Integer> listOfDuplicateElements = listOfNumbers.stream().filter(n -> !hashSet.add(n))
					.collect(Collectors.toList());

			System.out.println("List of Duplicate elements - ");
			System.out.println(listOfDuplicateElements);
		}

	}

}
