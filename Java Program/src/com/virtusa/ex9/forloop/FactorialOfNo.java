package com.virtusa.ex9.forloop;

import java.util.Scanner;

/*Factorial of a positive integer (number) is the 
 * sum of multiplication of all the integers smaller than that positive integer. 
 * For example, factorial of 5 is 5 * 4 * 3 * 2 * 1 which equals to 120.
 * 
 */
public class FactorialOfNo {

	public static void main(String[] args) {
    System.err.println("Enter a positive number");
	try (Scanner sc = new Scanner(System.in)) {
		int num = sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact *=i;
		}
		System.err.println("Factorial of "+ num + " is : " + fact);
	}
	
    

	}

}
