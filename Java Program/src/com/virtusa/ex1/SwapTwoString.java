package com.virtusa.ex1;
/* Write a Program to Swap two Strings without using temp variable
 * 
 */
public class SwapTwoString {
   
	public static void main(String args[])
    {
        // Declare two strings
        String firstString = "First";
        String secondString = "Second";
         
        // Print String before swapping
        System.out.println("Strings before swap: firstString = " +
                                       firstString + " and secondString = "+secondString);
         
        // append 2nd string to 1st
        firstString = firstString+secondString;
         
        // store initial string a in string b
        secondString = firstString.substring(0,firstString.length()-secondString.length());
         
        // store initial string b in string a
        firstString = firstString.substring(secondString.length());
         
        // print String after swapping
        System.out.println("Strings after swap: a = " +
                                     firstString + " and b = " + secondString);       
    }   
}
