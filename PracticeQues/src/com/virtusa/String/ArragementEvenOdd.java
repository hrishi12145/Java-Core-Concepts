package com.virtusa.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArragementEvenOdd {
	public static void main(String[] args) {
		int input[] = { 9, 12, 23, 8, 5 };
		int length = input.length;

		int[] arr = AlternateRearrange(input, length);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] AlternateRearrange(int[] input, int length) {
				// sort
		Arrays.sort(input);
		// even list
		List<Integer> evenList = new ArrayList<Integer>();
		// odd list
		List<Integer> oddList = new ArrayList<Integer>();
		// add value in list
		for(int i=0;i<length;i++) {
			if(input[i] % 2 == 0) {
				evenList.add(input[i]);
			}else {
				oddList.add(input[i]);
			}
		}
		
	// create a flag for first elemt is even or odd
		boolean flag = false ;
		// Set flag to true if first element is even
		if(input[0]%2==0) {
			flag = true ;
		}
		int index =0 , i=0,j=0;
		// rearrange the array
        while(index<length) {
        	if(flag == true) {
        		input[index]= (int) evenList.get(i);
        		i+=1;
        		index+=1;
        		flag=!flag;
        	}else {
        		input[index] =(int) oddList.get(j);
        		j+=1;
        		index+=1;
        		flag=!flag;
        	}
        }
        
        return input;
	}
}
