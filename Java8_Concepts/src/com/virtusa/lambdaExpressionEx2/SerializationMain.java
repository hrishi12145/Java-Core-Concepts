package com.virtusa.lambdaExpressionEx2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class SerializationMain {

	public static void main(String[] args) {

		ArrayList<Books> books = new ArrayList<>();
		books.add(new Books(4, "Java", 1200));
		books.add(new Books(3, "C", 1200));
		books.add(new Books(2, "Python", 1200));
		books.add(new Books(1, "Go", 1200));

		MyComparator compare = new MyComparator();
		Collections.sort(books, compare);

		//serialization
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\HRISHI\\OneDrive\\Documents\\books.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(books);
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		// for each with Lambda Expression
				books.forEach(iteration -> System.out.println(iteration));
		System.out.println();
		
		System.out.println("Serialization Done ... ");

	}

}
