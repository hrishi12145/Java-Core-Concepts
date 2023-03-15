package com.virtusa.lambdaExpressionEx2;

import java.util.Comparator;

public class MyComparator implements Comparator<Books> {

	@Override
	public int compare(Books obj1, Books obj2) {
		
		return obj1.bookId - obj2.bookId;
	}

	

}
