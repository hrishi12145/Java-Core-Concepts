package com.virtusa.ex9.ArraysEx;

import java.util.Arrays;

public class Main {
	
	public static void main(String args[]) {
		
		int[] data = { 20, 12, 10, 15, 2 };
		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(data));
		
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(data);
		
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(data));
	}
}
