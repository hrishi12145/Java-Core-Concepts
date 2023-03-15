package com.virtusa.ExceutorFrameWorkEx3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PatternFinder {

	public List<Integer> FindPattern(File fle,String strPattern){
		int lineno=1;
		String strLine;
		List<Integer> lineNolst = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(fle)))
		{
			while((strLine= br.readLine())!=null) {
				if(strLine.contains(strPattern))
				{
					lineNolst.add(lineno);
				}
				lineno++;
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return lineNolst;
		
	}
}
