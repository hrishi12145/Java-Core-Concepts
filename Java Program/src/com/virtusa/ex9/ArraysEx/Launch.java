package com.virtusa.ex9.ArraysEx;

import java.util.Arrays;

public class Launch {

	public static void main(String[] args) {
             
		// create an array
				int[] data = { -2, 45, 0, 11, -9 };

				// create an object of Main class
				SortNumber bs = new SortNumber();

				// call the method bubbleSort using object bs
				// pass the array as the method argument
				bs.bubbleSort(data);
				System.out.println("Sorted Array in Ascending Order:");

				// call toString() of Arrays class
				// to convert data into the string
				System.out.println(Arrays.toString(data));

	}

}
