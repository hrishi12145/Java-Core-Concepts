package com.virtusa.ex9.exfinally;

public class Boy {
      static void playing () {
    	  try {
              System.out.println("Playing Cricket");
              
          }
          finally
          {
              System.out.println("on the Cricket Ground ");
          }
      }
      public static void main(String args[])
      {
          try {
        	  playing();
          }
          finally {
			System.out.println("Finally Block has been exceuted");
		}
          
      }
}
