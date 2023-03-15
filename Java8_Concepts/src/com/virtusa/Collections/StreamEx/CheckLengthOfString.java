package com.virtusa.Collections.StreamEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckLengthOfString {

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

			List<String> listOfStringsGreaterthan7 = listOfString.stream().filter(x -> x.length() > 7)
					.collect(Collectors.toList());
			        

			int count = (int) listOfStringsGreaterthan7.stream().count();

			System.out.println("Count from original List whose str.length > 7 -");
			System.out.println(count);
			System.out.println();
			System.out.println("list Of Strings whose length is > 7 - ");
			System.out.println(listOfStringsGreaterthan7);
			
			Stream.of("V","I","R","U","S","A").forEach(System.out::println);
		}

	}

}
