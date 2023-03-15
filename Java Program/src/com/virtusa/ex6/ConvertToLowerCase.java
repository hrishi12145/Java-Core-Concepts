package com.virtusa.ex6;
// Convert a String to Lowercase
import java.util.Scanner;

public class ConvertToLowerCase {
	public static void main(String[] args) {

		System.out.println("Enter a String");
		try (Scanner input = new Scanner(System.in)) {
			String convert = input.nextLine();

			String result = convert.toLowerCase();
			
			System.out.println("Result is "+ result);
		}

	}
}
