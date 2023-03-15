package com.virtusa.Collections.StreamEx;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class FindAllEvenNumbers {

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

			Stream<Integer> evenNoList = listOfNumbers.stream().filter(x -> x % 2 == 0);

			System.out.println("Even Numbers from original list");
			evenNoList.forEach(iteration -> System.out.println(iteration));

		}

	}
}