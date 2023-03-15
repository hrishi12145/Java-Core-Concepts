package com.virtusa.IO.Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	@SuppressWarnings({ "deprecation", "resource" })
	public static void main(String[] args) throws IOException {

		try (FileInputStream fileInputStream = new FileInputStream(
				"C:\\Users\\HRISHI\\OneDrive\\Documents\\test.txt")) {

			DataInputStream dis = new DataInputStream(fileInputStream);

			String strLine = dis.readLine();
			
			System.out.println(strLine);
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\HRISHI\\OneDrive\\Documents\\test.txt");
	        
	        DataOutputStream outputStream = new DataOutputStream(fos);
	        
	        outputStream.writeChars(strLine);

		}
	}

}
