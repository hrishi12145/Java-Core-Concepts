package com.virtusa.lambdaExpressionEx2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeseralizationMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		
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
