package com.virtusa.Integer;

import java.util.Scanner;

/*  Test cases:
input1 : 2
output : 5

 * 
 */
public class CountCoins {
      public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Input");
		int input1=in.nextInt();
		int count=getcount(input1);
		System.out.println(count);
	}                                 
      private static int getcount(int input1) {
       int count = 0;
       while(input1!=0) {
    	   count +=(input1*input1);
    	   input1--;
       }
       return count;
      }
}
