package com.virtusa.File.IO.UsingExceutorFrameWork;

import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {

	public static void copyFiles(InputStream is , OutputStream os) throws Exception {
		
		int value = 0;
		
		while((value=is.read())!=-1){
			os.write(value);
		}
		is.close();
		os.close();
	}
}
