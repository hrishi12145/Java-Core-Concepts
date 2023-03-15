package com.virtusa.lambdaExpressionEx2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList<Books> books = new ArrayList<>();
		books.add(new Books(4, "Java", 1200));
		books.add(new Books(3, "Java", 1200));
		books.add(new Books(2, "Java", 1200));
		books.add(new Books(1, "Java", 1200));

		MyComparator compare = new MyComparator();
		Collections.sort(books, compare);

		// for each without Lambda Expression
//        for (Books books2 : books) {
//			System.out.println(books2);
//		}

		

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
		
		System.out.println("After Serialization - ");
		
		// for each with Lambda Expression
				books.forEach(iteration -> System.out.println(iteration));
		System.out.println();
		//Deserilization
		
		ArrayList<Books> deserializedBooks= new ArrayList<>();
		try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\HRISHI\\OneDrive\\Documents\\books.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            deserializedBooks = (ArrayList<Books>) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
             ioe.printStackTrace();
             return;
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             return;
          }
		System.out.println("After DeSerialization - ");
		deserializedBooks.forEach(iteration1 -> System.out.println(iteration1));

	}

}
