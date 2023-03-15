package com.virtusa.ex9.forloop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		System.err.println("Enter a positive number");
		
		try (Scanner sc = new Scanner(System.in)) {
			int no = sc.nextInt();
			System.err.println("Multiplication Table of number "+no);
			if(no>0) {
				for(int i=1; i<=10 ; i++) {
					System.out.println(no+" X "+i+" = "+(no*i));
				}
			}
		}
	}

}
