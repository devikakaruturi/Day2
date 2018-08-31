package com.capgemini.test;

public class Bubblesort {

	public static int[] sort(int ar[]) {
		int t;
		for(int i=0;i<=14;i++)
		{
			for(int j=i+1;j<=14;j++)
			{
				if(ar[i]>ar[j])
				{
					t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		return ar;
	}

}
