package com.virtusa.String;

import java.util.LinkedHashSet;

/* Test cases
input1 : geeksforgeeks 
output : geksfor

 * 
 */
public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String input1 = "geeksforgeeks";

		LinkedHashSet<Character> result = removeDuplicateFromString(input1);
		for (Character iterate : result) {
             System.out.print(iterate);
		}
	}

	private static LinkedHashSet<Character> removeDuplicateFromString(String input1) {
		LinkedHashSet<Character> charSet = new LinkedHashSet<>();
		char[] array = input1.toCharArray();
		for (int i = 0; i < array.length; i++) {
			charSet.add(array[i]);
		}
		return charSet;
	}

}
