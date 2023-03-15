package com.virtusa.ex1;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		System.out.println("Enter a String : ");
		try (Scanner input = new Scanner(System.in)) {
			String originalString = input.next();

			System.out.println("Original String Value : " + originalString);

			String reverseString = "";

			for(int i=originalString.length()-1;i>=0;--i){
				reverseString+=originalString.charAt(i);
			}
			System.out.println("After Reversing the String Value : " + reverseString);
		}
	}
}
