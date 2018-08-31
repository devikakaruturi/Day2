package com.capgemini.test;

public class Armstrong {

	public static boolean checkArmstrongNumber(int i) {
		// TODO Auto-generated method stub
		int temp=i;
		int c = 0;
		if(Math.abs(i)>0)
		{
			int ld=i%10;
			int md=(i/10)%10;
			int fd=i/100;
			c=(ld*ld*ld)+(md*md*md)+(fd*fd*fd);
		}	
		if(c==temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
