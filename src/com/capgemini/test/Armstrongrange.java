package com.capgemini.test;

public class Armstrongrange {

	public static int[] findAllArmstrongNumbers(int start, int end) {
		// TODO Auto-generated method stub
		int num;
		int allArmstrongNumbers[]=new int[10];
		int sum=0,index=0;
		for(int i=start;i<=end;i++)
		{
			num=i;
			while(num!=0)
			{
				int digit=num%10;
				sum=sum+digit*digit*digit;
				num=num/10;
			}
			if(sum==i)
			{
				allArmstrongNumbers[index++]=i;
			}
		}
		return allArmstrongNumbers;
	}

}
