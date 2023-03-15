package com.virtusa.lambdaExpressionEx2;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaMain {

	public static void main(String[] args) {
		ArrayList<Books> books = new ArrayList<>();
		books.add(new Books(4, "Java", 1200));
		books.add(new Books(3, "Java", 1200));
		books.add(new Books(2, "Java", 1200));
		books.add(new Books(1, "Java", 1200));
		
		// for each without Lambda Expression
		System.out.println("Before Sorting : ");
//		for (Books books2 : books) {
//			System.out.println(books2);
//		}
		
		// for each with Lambda Expression
		books.forEach(book -> System.out.println(book));
		
		
		
		Collections.sort(books, (obj1, obj2) -> obj1.bookId - obj2.bookId);
		
		System.out.println();
		System.out.println("After Sorting : ");
//		for (Books books2 : books) {
//			System.out.println(books2);
//		}
		
		// for each with Lambda Expression
		books.forEach(iteration -> System.out.println(iteration));

	}

}
