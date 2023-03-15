package com.virtusa.ExceutorFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test implements Runnable {

	String sourceFileName;
	String targetFileName;

	public Test(String sourceFileName, String targetFileName) {
		super();
		this.sourceFileName = sourceFileName;
		this.targetFileName = targetFileName;
	}

	@Override
	public void run() {
		try {
			// get the start time
			long start = System.nanoTime();
			IOUtils.copyFiles(new FileInputStream(sourceFileName), new FileOutputStream(targetFileName));
			System.out.println("Done in Runnable");

			// get the end time
			long end = System.nanoTime();

			// execution time
			long execution = end - start;
			System.out.println("Execution time: " + execution + " nanoseconds");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
