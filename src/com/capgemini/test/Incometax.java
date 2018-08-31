package com.capgemini.test;

public class Incometax {

	public static double caluculate1(int n) {
		 if(n>=180001&&n<=300000)
			{
			 	//System.out.println(n*0.1);
				return  (n*0.1);
			}
		 else if(n>=300001&&n<=500000)
			{
			 //System.out.println(n*0.2);
				return  (n*0.2);
			}
		 else if(n>=500001&&n<=1000000)
			{
			 
			 //System.out.println(n*0.3);
				return  (n*0.3);
			}
		 else
			 return 0;
	}

}
