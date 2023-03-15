package com.virtusa.Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Property {

	public static void main(String[] args) {
		try (OutputStream output = new FileOutputStream("src/config.properties")) {

			Properties property = new Properties();

			// set the properties value
			property.setProperty("db.url", "www.google.com");
			property.setProperty("db.user", "Hrishi");
			property.setProperty("db.password", "123456");

			// save properties to project root folder
			property.store(output, null);

			System.out.println("Url : "+property.getProperty("db.url"));
			System.out.println("Username :"+property.getProperty("db.user"));
			System.out.println("Password :"+property.getProperty("db.password"));

		} catch (IOException io) {
			io.printStackTrace();
		}

	}

}
