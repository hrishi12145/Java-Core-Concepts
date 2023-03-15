package com.virtusa.ex9.NumberToWord;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {

		int number = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please type a number(max upto 9 digits)");
		try {

			number = input.nextInt();
			if (number == 0) {
				System.out.print("Number in words: Zero");
			} else {
				System.out.print("Number in words: " + numberToWord(number));
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid number");
		}

		input.close();
	}

	private static String numberToWord(int number) {

		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		String words = "";

		if (number == 0) {
			return "zero";
		}
		// for minus
		if (number < 0) {

			String numberStr = "" + number;

			numberStr = numberStr.substring(1);

			return "minus " + numberToWord(Integer.parseInt(numberStr));
		}

		if ((number / 100000000) > 0) {
			words += numberToWord(number / 100000000) + " billion";
			number %= 100000000;
		}
		if ((number / 10000000) > 0) {
			words += numberToWord(number / 10000000) + " crore ";
			number %= 10000000;
		}

		if ((number / 1000000) > 0) {
			words += numberToWord(number / 1000000) + " Lac ";
			number %= 1000000;
		}

		if ((number / 1000) > 0) {
			words += numberToWord(number / 1000) + " thousand ";
			number %= 1000;
		}

		if ((number / 100) > 0) {
			words += numberToWord(number / 100) + " hundred ";
			number %= 100;
		}

		if (number > 0) {

			if (number < 20) {

				words += unitsArray[number];
			} else {

				words += tensArray[number / 10];
				if ((number % 10) > 0) {
					words += "-" + unitsArray[number % 10];
				}
			}
		}
		return words;
	}

}
