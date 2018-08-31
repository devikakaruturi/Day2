package com.capgemini.test;

public class Discount {
	public static double[] calculate(double i) {
		// TODO Auto-generated method stub
		double discount;
		double newItemPrice;
		discount=i*0.35;
		newItemPrice=i-discount;
		double arr[]= {0,0};
		arr[0]=discount;
		arr[1]=newItemPrice;
		return arr;

	}

	
}
