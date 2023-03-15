package com.virtusa.IO.Stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\HRISHI\\OneDrive\\Documents\\test.txt";

		FileOutputStream fos = new FileOutputStream(path);

		DataOutputStream outputStream = new DataOutputStream(fos);

		outputStream.writeChars(path);

	}

}
