package com.virtusa.Array;

import java.util.Arrays;
import java.util.Scanner;

/*  Write a Number Sum program - 
 * 
 * Test cases:
input 1: 7
input 2: { 7,2,6,15,54,10,23}

minimum no - 2
maximum no - 54

Sum of minimum no + maximum no 

output : 56

 * 
 */
public class NumberSum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		System.out.println("Enter the element:");
		for(int i=0;i<input2.length;i++) {
			input2[i]=in.nextInt();
		}
		
		System.out.println(Arrays.toString(input2));
		
		int result=numbersum(input1,input2);
		System.out.println(result);	
	}

	private static int numbersum(int input1, int[] input2) {
		int min =0;
		int max =0;
		int[] sortArray = input2;
		Arrays.sort(sortArray);
		for(int i=0;i<sortArray.length;i++) {
		    min = sortArray[0];
			max = sortArray[input2.length-1];
		}
		int sum = min+max;
		return sum;
		
	}

}
