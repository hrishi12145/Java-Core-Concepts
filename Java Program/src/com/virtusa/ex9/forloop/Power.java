package com.virtusa.ex9.forloop;
/*
 * Two numbers are entered through the keyboard. 
 * Write a program to find the value of one number raised to the power of another.
 *  (Do not use Java built-in method)
 */
import java.util.Scanner;

public class Power
{
    public static void main(String[] args)
    {
        try (Scanner userInput = new Scanner(System.in)) {
			int base;
			int power;
			int result = 1;
			
			System.out.print("Enter the base number ");
			base = userInput.nextInt();
			
			System.out.print("Enter the power ");
			power = userInput.nextInt();

			for(int i = 1; i <= power; i++)
			{
			result = result * base;
			}

			System.out.println("Power of "+ base +" is "+ result);
		}
    }
}