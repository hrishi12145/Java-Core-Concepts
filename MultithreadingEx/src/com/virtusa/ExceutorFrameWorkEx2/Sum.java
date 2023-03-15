package com.virtusa.ExceutorFrameWorkEx2;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class Sum implements Runnable {

	static int sumOfThread1 = 0;
	static int sumOfThread2 = 0;
	static int totalSum = 0;

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Define the size of an Array: ");
			int size = input.nextInt();
			int[] numbers = new int[size];
			System.out.println("Add element");
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = input.nextInt();
			}

			ExecutorService es = Executors.newFixedThreadPool(2);

			es.submit(new Runnable() {

				@Override
				public void run() {

					for (int i = 0; i < numbers.length; i++) {
						if (i == 0 && i == 2) {
							sumOfThread1 = sumOfThread1 + numbers[i];
						}
						;
						if (i == 6 && i == 8) {
							sumOfThread1 = sumOfThread1 + numbers[i];
						}
					}
					System.out.println("Sum of array using thread1 - " + sumOfThread1);

				}
			});

			es.submit(new Runnable() {

				@Override
				public void run() {

					for (int j = 0; j < numbers.length; j++) {
						if (j == 3 && j == 5) {
							sumOfThread2 = sumOfThread2 + numbers[j];
						}
						;
						if (j == 9 && j == 11) {
							sumOfThread2 = sumOfThread2 + numbers[j];
						}

					}
					System.out.println("Sum of array using thread2 - " + sumOfThread2);
				}
			});

			totalSum = sumOfThread1 + sumOfThread2;
			System.out.println("Total Sum of Array using 2 threads are - " + totalSum);

		}

	}

}
