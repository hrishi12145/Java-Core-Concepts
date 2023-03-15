package com.virtusa.Array;

import java.util.Scanner;

/* 
 * Test cases:  
input1 : {1,0 ,2 ,5,0,6,0,0,9}
input2 : 9
output  : 1 2 5 6 9 0 0 0 0 

 * 
 */
public class PushZeroToEnd {
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
		
		int[] res=pushZeroToEnd(input1,input2);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+ " ");
			
		}
	}

  static int[] pushZeroToEnd(int input1, int[] input2) {

	   int count=0;
	   for(int i=0;i<input2.length;i++) {
		   if(input2[i]!=0) {
			   input2[count++]=input2[i];
		   }
	   }
	   while(count<input1) {
		   input2[count++]=0;
	   }
	   return input2;
	}

}
