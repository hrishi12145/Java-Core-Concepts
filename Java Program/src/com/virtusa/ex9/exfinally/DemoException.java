package com.virtusa.ex9.exfinally;

import java.util.Scanner;

//Java program to illustrate finally in
//Case where exceptions occur
//and match in the program
public class DemoException {

	public static void main(String[] args)
	{
		
	
			System.out.println("In try block");
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter Numerator");
				int numerator = sc.nextInt();
				System.out.println("Enter Denominator");
				int denominator = sc.nextInt();
				int result = numerator / denominator;
				System.out.println(result);
			}catch (ArithmeticException e) {
			    e.printStackTrace();
			}

			finally
			{
				System.out.println("Executes Finally block whether an exception occurs or not");
			}
			

		
	}
}

