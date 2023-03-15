package com.virtusa.codingEx3;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a binary number -");
		String binary = input.next();
		int output =binaryToDecimal(binary);
        System.out.println(output);
	}

	static int binaryToDecimal(String binary) {

		int length = binary.length();
		int base = 1;
		int result = 0;

		for (int i = length - 1; i >= 0; i--) {
			if (binary.charAt(i) == '1') {
				result += base;
			}
			base *= 2;
		}

		return result;
		
		// BinaryToDecimal - using Integer.parseInt()
		
	 //	return Integer.parseInt(binary, 2);
	}

}
