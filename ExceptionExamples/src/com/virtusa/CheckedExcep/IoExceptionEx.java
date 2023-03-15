package com.virtusa.CheckedExcep;
/*
 * The IOException i.e Input-Output exceptions occur during input and output operations, For example, Reading the file, Accessing the file, etc.
 * For example FileNotFound Exception occurs if the we try to read file using wrong path etc.
 */
import java.io.File;
import java.io.FileInputStream;

class IoExceptionEx{
    public static void main(String[] args){
        //Accessing the wrong file using invalid path
    	
        try {
        	File object=new File("/hrishi/home");
        	FileInputStream fl=new FileInputStream(object);
        	System.out.println(fl.read());
        	fl.close();
        }
        catch(Exception e) {
        	e.printStackTrace();
        	System.out.println("Io Excetion has been Occured..");
        	}
    }
}