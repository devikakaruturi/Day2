package com.capgemini.test;

public class Palindrome {

	public static Object checkpalindrome(int num) {
		// TODO Auto-generated method stub
		int sum=0,r,t=num;
		while(num > 0)
		 {
			 r=num%10;
			 sum=sum*10+r;
			 num=num/10;
		 }
		 if(t==sum)
		 {
			 return true;
		 }
		 else
		 {
			return false;
		 }
	}

}
