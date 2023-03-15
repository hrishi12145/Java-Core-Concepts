package com.virtusa.String;
/*  Test cases:
input1 : abcdd
output : d

 * 
 */
public class MaxOccuringChar {

	public static void main(String[] args) {

		String input1="abbbaaaaaa";
		String res = maxOccurance(input1);
		System.out.println(res);
	}
	private static String maxOccurance(String input1) 
	{
		char[] c=new char[26];
		String s="";
		for(int i=0;i<input1.length();i++)
		{
			char ch= input1.charAt(i);
			c[ch-97]++;
		}
		int max=0;
		for(int i=1;i<26;i++)
		{
			if(c[max]<c[i])
				max=i;
		}
		for(int i=0;i<26;i++)
		{
			if(c[i]==c[max]&&i!=max)
				return "0";
		}
		return s+(char)(max+97);
	}

}
