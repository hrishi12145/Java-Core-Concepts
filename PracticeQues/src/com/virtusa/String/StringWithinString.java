package com.virtusa.String;

import java.util.Scanner;

/* Test Case:
input1: abab
input2: ab
output:
yes

Logic - StringWithinString - firstStr.contains(secondStr);
use built in method contains() to check if 2nd string present in 1st String

 * 
 */
public class StringWithinString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter an Input1");
		String input1 = in.nextLine().toLowerCase();
		System.out.println("Enter an Input2");
		String input2 = in.nextLine().toLowerCase();

		String res = callStringWithinString(input1, input2);
		System.out.println(res);

	}

	static String callStringWithinString(String input1, String input2) {
		
		if (input1.contains(input2)) {
			return "yes";
		}
		return "no";
	}

}
