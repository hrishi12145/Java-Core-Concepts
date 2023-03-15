package com.virtusa.File.IO.UsingExceutorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {

		

		ExecutorService es = Executors.newFixedThreadPool(2);
		
		String[] sourceFileNames= {
				"C:\\Users\\HRISHI\\OneDrive\\Documents\\source1.txt",
				"C:\\Users\\HRISHI\\OneDrive\\Documents\\source2.txt",
				"C:\\Users\\HRISHI\\OneDrive\\Documents\\source3.txt",
				"C:\\Users\\HRISHI\\OneDrive\\Documents\\source4.txt",
		};
		
		String[] targetFileNames= {
				"C:\\Users\\HRISHI\\OneDrive\\Documents\\target1.txt",
				"C:\\Users\\HRISHI\\OneDrive\\Documents\\target2.txt",
				"C:\\Users\\HRISHI\\OneDrive\\Documents\\target3.txt",
				"C:\\Users\\HRISHI\\OneDrive\\Documents\\target4.txt",
		};
		
		for(int i=0;i<sourceFileNames.length;i++) {
			es.submit(new Test(sourceFileNames[i], targetFileNames[i]));
		}
		
	

	}

}
