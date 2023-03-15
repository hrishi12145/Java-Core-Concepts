package com.virtusa.codingEx3;

public class BinaryToDecimal2 {
  public static void main(String[] args) {
	  String s = "0010";
	 int result = binaryToDecimal(s);
	 System.out.println(result);
}

  static int binaryToDecimal(String s) {
	  return Integer.parseInt(s, 2);
  }
	

}
