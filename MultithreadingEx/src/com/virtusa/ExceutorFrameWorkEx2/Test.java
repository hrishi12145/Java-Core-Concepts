package com.virtusa.ExceutorFrameWorkEx2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//
//class Mcallable implements Callable<Integer> {
//
//	public int sum = 0;
//
//	@Override
//	public Integer call() throws Exception {
//
//		return null;
//	}
//
//}

public class Test {

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(2);
		
		int[] numbers = { 1, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 1 };
		int t1Sum = 0;
		int t2Sum = 0;
		// iterate over numbers array
		for (int i = 0; i < numbers.length; i++) {

			for (int j = i; j < numbers.length / 3; j++) {
				t1Sum = t1Sum + numbers[i];
			}

			for (int k = i + 3; k < numbers.length / 3; k++) {
				t2Sum = t2Sum + numbers[i];
			}

			for (int l = i + 6; l < numbers.length / 3; l++) {
				t1Sum = t1Sum + numbers[i];
			}

			for (int m = i + 9; m < numbers.length / 3; m++) {
				t2Sum = t2Sum + numbers[i];
			}
		}
		System.out.println(t1Sum);
		System.out.println(t2Sum);

	}

}
