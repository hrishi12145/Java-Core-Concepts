package com.virtusa.ex1;

public class SwapTwoNumber {
	public static void main(String[] args) {
          int firstNo = 1 ;
          int secondNo = 2;
          
          System.out.println("Before Swap FirstNo : " + firstNo);
          System.out.println("Before Swap SecondNo : "+ secondNo);
          
          firstNo = firstNo + secondNo;
          
          secondNo = firstNo - secondNo;
          
          firstNo = firstNo - secondNo;
          
          System.out.println("After Swap FirstNo : " + firstNo);
          System.out.println("After Swap SecondNo : "+secondNo);
          
	}
}
