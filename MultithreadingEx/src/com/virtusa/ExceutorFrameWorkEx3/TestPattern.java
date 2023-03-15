package com.virtusa.ExceutorFrameWorkEx3;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import java.util.concurrent.Callable;

class Mycallable implements Callable<List<Integer>> {

	File fi;
	String strPattern;
	PatternFinder pf = new PatternFinder();

	Mycallable(File f, String pattern) {
		this.fi = f;
		this.strPattern = pattern;
	}

	@Override
	public List<Integer> call() throws Exception {
		List<Integer> lineNoLst = pf.FindPattern(fi, strPattern);
		return lineNoLst;
	}

}

public class TestPattern {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(4);
		String strPattern = "public";
		File f = new File("C:\\Users\\HRISHI\\OneDrive\\Desktop\\New folder\\Java Program\\src\\com\\virtusa\\ex1");
		File[] farray = f.listFiles();
		for (File fi : farray) {
			if (fi.getName().endsWith("java")) {
				Future<List<Integer>> fLst = executorService.submit(new Mycallable(f, strPattern));

				try {
					System.out.println(strPattern + " is found in line no[" + fLst.get() + "]of file " + fi.getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();

				}
				System.out.println("Hello");
			}
		}
	}

}
