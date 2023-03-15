package com.virtusa.ExceutorFrameWorkEx3;

import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

public class Mycallable1 implements Callable<List<Integer>> {

	File fi;
	String strPattern;
	PatternFinder pf = new PatternFinder();

	Mycallable1(File f, String pattern) {
		this.fi = f;
		this.strPattern = pattern;
	}

	@Override
	public List<Integer> call() throws Exception {
		List<Integer> lineNoLst = pf.FindPattern(fi, strPattern);
		return lineNoLst;
	}

}
