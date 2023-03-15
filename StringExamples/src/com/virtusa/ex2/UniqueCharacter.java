package com.virtusa.ex2;

import java.util.Scanner;

public class UniqueCharacter {
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

			// Iterate over the string and first check for a duplicate character in a
			// string. If found just delete that character using deleteCharAt() method.
			for (int i = 0; i < sbString1.length(); i++) {
				int c = 0;
				for (int j = i + 1; j < sbString1.length(); j++) {
					if (sbString1.charAt(i) == sbString1.charAt(j)) {
						sbString1.deleteCharAt(j);
						c++;
					}
				}
				if (c >= 1) {
					sbString1.deleteCharAt(i);
				}
			}
			//At last, just print the string without a common character.
			System.out.println("Unique Character in String 1 :" + sbString1);
			System.out.println("count : "+sbString1.length());
			
			System.out.println();
			// Iterate over the string and first check for a duplicate character in a
			// string. If found just delete that character using deleteCharAt() method.
			for (int i = 0; i < sbString2.length(); i++) {
				int c = 0;
				for (int j = i + 1; j < sbString2.length(); j++) {
					if (sbString2.charAt(i) == sbString2.charAt(j)) {
						sbString2.deleteCharAt(j);
						c++;
					}
				}
				if (c >= 1) {
					sbString2.deleteCharAt(i);
				}
			}
			//At last, just print the string without a common character.
			System.out.println("Unique Character in String 2 :" + sbString2);
			System.out.println("count : "+sbString2.length());
		}

	}
}