package com.virtusa.String;

import java.util.Scanner;

/*  A string is called a palindrome string 
 * if the reverse of that string is the same as the original string
 * 
 */
public class IsPalindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String originalStr = in.nextLine();
		System.out.println(isPalindrome(originalStr));

	}

	private static int isPalindrome(String originalStr) {
		String reverseStr = "";
		int strLength = originalStr.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr += originalStr.charAt(i);
		}
		if (originalStr.toLowerCase().equals(reverseStr.toLowerCase())) {
			return 1;
		} else {
			return 0;
		}

	}

}
