package com.capgemini.test;

public class Reversestring {

	public static String reverse(String string) {
		// TODO Auto-generated method stub
		String s1="";
		String str2[]=string.split(" ");
		for(int i=0;i<str2.length;i++)
		{
			String reverse="";
			for(int j=str2[i].length()-1;j>=0;j--)
			{
				reverse=reverse+str2[i].charAt(j);
			}
			s1=s1+reverse+" ";
		}
		return s1;
	}

}
