package com.virtusa.ex2;

/* Java Program to count Vowels, Consonants, Digits and Whitespaces */

import java.util.Scanner;

public class CountVowelsConsonantsDigitsWhitespaces {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a string : ");
			String str = input.nextLine();

			char newStr[] = str.toCharArray();

			int vowel = 0, consonant = 0, digit = 0, whitespace = 0, specialChar = 0;

			for (int i = 0; i < newStr.length; i++) {

				if ((newStr[i] >= 'a' && newStr[i] <= 'z') || (newStr[i] >= 'A' && newStr[i] <= 'Z')) {
					if (newStr[i] == 'a' || newStr[i] == 'A' || newStr[i] == 'e' || newStr[i] == 'E' || newStr[i] == 'i'
							|| newStr[i] == 'I' || newStr[i] == 'o' || newStr[i] == 'O' || newStr[i] == 'u'
							|| newStr[i] == 'U') {
						vowel++;
					} else {
						consonant++;
					}
				} else if (newStr[i] >= '0' && newStr[i] <= '9') {
					digit++;
				} else if (newStr[i] == ' ') {
					whitespace++;
				} else {
					specialChar++;
				}
			}

			System.out.println("Number of vowel = " + vowel);
			System.out.println("Number of consonant = " + consonant);
			System.out.println("Number of digit = " + digit);
			System.out.println("Number of whitespace = " + whitespace);
			System.out.println("Number of Special Characters = " + specialChar);

		}
	}
}
