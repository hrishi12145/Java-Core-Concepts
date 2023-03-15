package com.virtusa.Array;

//Test cases
//input1=7;
//input2[]= {1,2,3,4,5,6,7};
//  index -  0,1,2,3,4,5,6
//input3=2;
//output:
//3 4 5 6 7 1 2
import java.util.Scanner;

public class PlayingWithArray {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int input1 = in.nextInt();

		// declare and initialize array
		int[] input2 = new int[input1];

		// enter the elements in the array
		for (int i = 0; i < input2.length; i++) {
			System.out.println("Enter element in Array");
			input2[i] = in.nextInt();
		}
		System.out.println("Enter index value");
		int input3 = in.nextInt();

		// obtain the array using method
		int[] result = shiftwithArray(input1, input2, input3);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

	static int[] shiftwithArray(int input1, int[] input2, int input3) {
		int[] array = new int[input2.length];
		int j = 0;
		// loop to iterate from 2 to input2.length
		for (int i = input3; i < input2.length; i++) {
			// increment array[index++] = add value input2[index value]
			array[j++] = input2[i];
			// 3 4 5 6 7
		}
		for (int i = 0; i < input3; i++) {
			// 1 2
			array[j++] = input2[i];
		}
		return array;

	}

}
