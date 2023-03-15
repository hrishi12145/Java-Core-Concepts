package com.virtusa.codingEx;
/*  rearrange the numbers of the array in such a way that even
 * and odd numbers arranged alternatively in increasing order
 * input1=5
 * input2={9,12,23,8,5}
 * 
 * output - {even,odd,even,odd} increasing order
 *        - { 5,8,9,12,23}
 */

import java.util.Arrays;
import java.util.Scanner;

public class Arrangement {

	public static void main(String[] args) {
		int even;
		int odd;

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter how many elements you want in array");
			int size = input.nextInt();
			int[] numbers = new int[size];
			int size1 = numbers.length;
			int[] arrange = new int[size1];

			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = input.nextInt();
			}

			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] % 2 == 0) {
					even = numbers[j];
					arrange[j] = even;
				} else {
					odd = numbers[j];
					arrange[j]=odd;
				}
			}
			Arrays.sort(arrange);
			System.out.println(Arrays.toString(bubbleSort(arrange)));
		}
		
	}
	
	// method to perform bubble sort
		static int[] bubbleSort(int arrange[]) {
			int size = arrange.length;

			// for ascending or descending sort
			System.out.println("Choose Sorting Order:");
			System.out.println("1 for Ascending \n2 for Descending");
			int sortOrder = 1;

			// run loops two times
			// first loop access each element of the array
			for (int i = 0; i < size - 1; i++)

				// second loop performs the comparison in each iteration
				for (int j = 0; j < size - i - 1; j++)

					// sort the array in ascending order
					if (sortOrder == 1) {
						// compares the adjacent element
						if (arrange[j] > arrange[j + 1]) {

							// swap if left element is greater than right
							int temp = arrange[j];
							arrange[j] = arrange[j + 1];
							arrange[j + 1] = temp;
						}
					}

					// sort the array in descending order
					else {
						// compares the adjacent element
						if (arrange[j] < arrange[j + 1]) {

							// swap if left element is smaller than right
							int temp = arrange[j];
							arrange[j] = arrange[j + 1];
							arrange[j + 1] = temp;
						}
					}
			return arrange;

		}

	

}
