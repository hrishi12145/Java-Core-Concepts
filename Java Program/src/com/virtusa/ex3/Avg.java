package com.virtusa.ex3;
// Average of numbers
import java.util.Scanner;

class Avg {

	double res;

	Avg(int a[], int n) {
		res = 0;

		for (int i = 0; i < n; i++)
			res = res + a[i];

	}
	
	public static void main(String args[]) {
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter how many numbers to cal  avg");

			n = sc.nextInt();

			int a[] = new int[n];

			System.out.println("enter   " + n + "  numbers");

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			Avg k = new Avg(a, n);

			System.out.println("Average =" + k.res);
		}

	}
}