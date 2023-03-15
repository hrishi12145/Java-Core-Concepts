package com.virtusa.Collections.StreamEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CheckNameStartWith {

	public static void main(String[] args) {
		ArrayList<String> listOfString = new ArrayList<>();

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("how many String elements do you want to add: ");
			int number = input.nextInt();
			for (int i = 0; i <= number - 1; i++) {
				System.out.print("Add String Element: ");
				String element = input.next();
				listOfString.add(element);
			}
			System.out.println("Orignial List -");
			System.out.println(listOfString);
			System.out.println();

			List<String> startsWithR = listOfString.stream().filter(x -> x.startsWith("R"))
					.collect(Collectors.toList());

			int count = (int) startsWithR.stream().count();
			
			
			System.out.println("list Of Strings whose name startsWithR");
			System.out.println(startsWithR);
			System.out.println();
			System.out.println("Count from original List whose str.startsWithR");
			System.out.println(count);
			

		}

	}
}
