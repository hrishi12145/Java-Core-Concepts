package com.virtusa.IO.StreamEx;

import java.util.Scanner;

/*  Accept data from user via Scanner , validate the same for correctness 
 * ( not null,  numeric ,date type etc )
 * 
 */
public class ScannerClass {

	public static void main(String[] args) {

		System.out.println("Enter a user input - ");
          try (
		Scanner input = new Scanner(System.in)) {
			String data1 = input.next();
			try{
			    Integer.parseInt(data1);
			    System.out.println("Integer");
			}catch(NumberFormatException e){
			    System.out.println("String");
			}
		}
	
	}

}
