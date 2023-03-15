package com.virtusa.ex2;

import java.util.*;

public class CommonCharacter {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter first String : ");
			String string1 = input.nextLine();
			System.out.println("Enter second String : ");
			String string2 = input.nextLine();

			// Pass the string to the string buffer and remove the white space in both
			// strings.
			StringBuffer sbString1 = new StringBuffer(string1.replace(" ", ""));
			StringBuffer sbString2 = new StringBuffer(string2.replace(" ", ""));

			// Use the nested loop to iterate over the string1. Initialize count variable
			// also
			for (int i = 0; i < sbString1.length(); i++) {
				int c = 0;

				// Now, compare both the character at the specified position.
				// If both the character matches then delete that character and increment the
				// count value.
				for (int j = i + 1; j < sbString1.length(); j++) {
					if (sbString1.charAt(i) == sbString1.charAt(j)) {
						sbString1.deleteCharAt(j);
						c++;
					}
				}
				// Now, once the inner loop exits, check the count value. If it is greater than
				// 1, delete that character from the specified position.
				if (c >= 1) {
					sbString1.deleteCharAt(i);
				}
			}
			// Use the nested loop to iterate over the string2. Initialize count variable
			// also
			for (int i = 0; i < sbString2.length(); i++) {
				int c = 0;

				// Now, compare both the character at the specified position.
				// If both the character matches then delete that character and increment the
				// count value.
				for (int j = i + 1; j < sbString2.length(); j++) {
					if (sbString2.charAt(i) == sbString2.charAt(j)) {
						sbString2.deleteCharAt(j);
						c++;
					}
				}
				// Now, once the inner loop exits, check the count value. If it is greater than
				// 1, delete that character from the specified position.
				if (c >= 1) {
					sbString2.deleteCharAt(i);
				}
			}
			// declare common char count
			int commonCharCount = 0;

			// At last, use a nested loop to compare both the string1 and string2 see if there is
			// matched character, then increment count value.
			for (int i = 0; i < sbString1.length(); i++) {
				for (int j = 0; j < sbString2.length(); j++) {
					if (sbString1.charAt(i) == sbString2.charAt(j)) {
						commonCharCount++;
					}
				}
			}
			// Print the Count of Common characters in the String
			System.out.println("Common character count : " + commonCharCount);

		}
	}
}
