package com.virtusa.Array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Test cases:
input1 : 5
input2 : {1 , 2 , 3 ,4, 5}
output : 5 4 3 2 1

 */
public class ReverseArray {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		System.out.println("Enter element:");
		for (int i = 0; i < input2.length; i++) {
			input2[i] = in.nextInt();
		}
		int[] result = reverseArray(input1, input2);
		
		System.out.println(Arrays.toString(result));
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
	}

	private static int[] reverseArray(int input1, int[] input2) {
          int[] reverse = new int[input1];
          int j=0;
          for(int i=(input2.length - 1);i>=0;--i) {
        	  reverse[j] = input2[i];
        	  j++;
          }
          return reverse;
	}
}
