package com.virtusa.codingEx;
/*   Question -- StringWithinString
 *   return "yes" if String "y" is contain in string "x" else return "no"
 * 
 */
import java.util.Scanner;

public class StringWithinString {

	public static void main(String[] args) {	
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter first str");
			String firstStr = input.nextLine(); // abac
			System.out.println("Enter second str");
			String SecondStr = input.nextLine(); //ab
			System.out.println(check(firstStr,SecondStr));
		}

	}

	private static String check(String firstStr, String secondStr) {		
		if(firstStr.contains(secondStr)) {
			return "yes";
		}else {
			return "no";
		}
		
	}

}
