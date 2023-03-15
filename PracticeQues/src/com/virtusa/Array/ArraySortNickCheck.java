package com.virtusa.Array;

import java.util.Arrays;
import java.util.Scanner;

/* Consecutive numbers are numbers that follow each other in order. 
 * They have a difference of 1 between every two numbers. 
 * In a set of consecutive numbers,the mean and the median are Equal. 
 * If n is a number, then n, n+1, and n+2 would be consecutive numbers Examples. 1, 2, 3, 4, 5
 * 
 * Test Case:
input1:6
input2[]: {3,7,2,5,4,6}
output:
1

 */
public class ArraySortNickCheck {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array");
		int input1 = in.nextInt();
		
		int[] input2 = new int[input1];
		
		for(int i=0;i<input2.length;i++) {
			System.out.println("Enter Element");
			input2[i]=in.nextInt();
		}
		
		int result = getCount(input1, input2);
		System.out.println("return 1 if ar is a Consecutive Array otherwise return 0");
		System.out.println(result);

	}

	private static int getCount(int input1, int[] input2) 
	{
		//declare ar and intialize it - size is input2.length
		int ar[]=new int[input2.length];
		
		//iterate over input2 and add value in ar[i] = input2[i]
		for(int i =0;i<input2.length;i++)
		{
			ar[i]=input2[i];
		}
		//before sort ar - 3,7,2,5,4,6
		//Sort Array ar
		Arrays.sort(ar);
		// after sort ar - 2,3,4,5,6
		// declare num give value of sorted ar[0]
		int num=ar[0]; // 2 // 3
		//iterate over ar till input2.length
		for(int i=0;i<input2.length;i++)
		{
			//check if ar[i] is not equal to num
			if(ar[i]!=num) // ar[0] is 2 and num is 2 , // ar[1] is 3 and num is 3 repeated steps for other iterartion
				//if not equal return 0 bez ar is not Consecutive Array
				return 0;
			//otherwise increment num value 
			num++; // 3 // 4 // 5 // 6
		}
		// return 1 if ar is a Consecutive Array
		return 1;
	}

}
