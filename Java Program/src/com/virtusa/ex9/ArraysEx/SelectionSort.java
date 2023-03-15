package com.virtusa.ex9.ArraysEx;

//Selection sort in Java
/*
 * Selection sort is a sorting algorithm that selects the smallest element 
 * from an unsorted list in each iteration and places that element at the beginning 
 * of the unsorted list.
 */
public class SelectionSort {
	void selectionSort(int array[]) {
		int size = array.length;
		// first loop access each element of the array
        for(int step=0;step<size-1;step++) {
        	int min_index=step;
        	for(int i=step+1;i<size;i++) {
        		if(array[i]<array[min_index]) {
        			min_index=i;
        		}
        	}
        	int temp = array[step];
        	array[step]=array[min_index];
        	array[min_index]=temp;
        }
	}


}
