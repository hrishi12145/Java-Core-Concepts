package com.virtusa.Integer;

/* 
 * Test cases:
input1 : {4,3,5}
input2 : PNP
input3 : 3
output : 600

 * 
 */
public class ElectroStatic {

	public static void main(String[] args) {
		int[] input1 = { 4, 3, 5 };
		String input2 = "PNP";
		int input3 = 3;
		int result = electroStatic(input1, input2, input3);
		System.out.println(result);
	}

	private static int electroStatic(int[] input1, String input2, int input3) {
		int sum=0;
		for(int i=0;i<input3;i++) {
			char ch = input2.charAt(i);
			switch (ch) {
			case 'P':
				sum=sum+input1[i];
				break;

			case 'N':
				sum=sum-input1[i];
				break;
			}
		}
		return sum*100;
	}

}
