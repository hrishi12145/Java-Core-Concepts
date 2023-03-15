package com.virtusa.Array;

import java.util.HashSet;
import java.util.LinkedHashSet;

/* Input1: {1,2,2,11,11,11,15,6}
Input2 : 8
Output : 1 2 11 15 6

 * 
 * 
 */
public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		int input1 = 8;
		int[] input2 = { 0,0,0,1,1,1,2,2,2 };
		HashSet<Integer> result =removeDuplicate(input1,input2);
		for (Integer integer : result) {
			System.out.print(integer+" ");
		}
	}

	private static HashSet<Integer> removeDuplicate(int input1, int[] input2) {
		
		HashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<input2.length;i++) {
			set.add(input2[i]);
		}
		return set;
		
	}

}
