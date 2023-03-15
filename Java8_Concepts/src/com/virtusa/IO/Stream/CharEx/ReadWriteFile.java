package com.virtusa.IO.Stream.CharEx;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteFile {

	public static void main(String[] args) throws Exception {

		//Reader
		FileReader reader = new FileReader("C:\\Users\\HRISHI\\OneDrive\\Documents\\test.txt");
		int i;
		while ((i = reader.read()) != -1)
			System.out.print((char) i);
		reader.close();

		// Writer
		FileWriter writer = new FileWriter("C:\\Users\\HRISHI\\OneDrive\\Documents\\test.txt",true);
		String str = "This time never come back ";
		writer.write (str);
        writer.flush ();
        writer.close ();
        System.out.println ("Success");
		

	}

}
