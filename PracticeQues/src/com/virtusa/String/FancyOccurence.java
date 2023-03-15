package com.virtusa.String;

import java.util.Scanner;

/*  Test Case:
input1:Welcome to metti
input2:i
output:
Welcome to mett

 * 
 */
public class FancyOccurence {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter an Input1");
		String input1=in.nextLine();
		System.out.println("Enter an Input2");
		String input2=in.next();
		
		String res = callFancyOccurence(input1,input2);
		System.out.println(res);

	}
                                        
	 static String callFancyOccurence(String input1, String input2) {
		
		String result="";
		char charAtInput2=input2.charAt(0);
		for(int i=0;i<input1.length();i++) {
			char charAtInput1 = input1.charAt(i);
			if(charAtInput1 != charAtInput2) {
				result = result+charAtInput1;
			}
		}
		return result;
		
	}

}
