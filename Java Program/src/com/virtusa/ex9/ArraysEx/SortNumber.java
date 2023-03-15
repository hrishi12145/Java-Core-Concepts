package com.virtusa.ex9.ArraysEx;
/*
 * Bubble Sort -
 *  Iteration (Compare and Swap)
Starting from the first index, compare the first and the second elements.
If the first element > than the second element, they are swapped.
 */
import java.util.Scanner;

class SortNumber {

// create an object of scanner
// to take input from the user
	Scanner input = new Scanner(System.in);

// method to perform bubble sort
	void bubbleSort(int array[]) {
		int size = array.length;

		// for ascending or descending sort
		System.out.println("Choose Sorting Order:");
		System.out.println("1 for Ascending \n2 for Descending");
		int sortOrder = input.nextInt();

		// run loops two times
		// first loop access each element of the array
		for (int i = 0; i < size - 1; i++)

			// second loop performs the comparison in each iteration
			for (int j = 0; j < size - i - 1; j++)

				// sort the array in ascending order
				if (sortOrder == 1) {
					// compares the adjacent element
					if (array[j] > array[j + 1]) {

						// swap if left element is greater than right
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}

				// sort the array in descending order
				else {
					// compares the adjacent element
					if (array[j] < array[j + 1]) {

						// swap if left element is smaller than right
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}

	}
}