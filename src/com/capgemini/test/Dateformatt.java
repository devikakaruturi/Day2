package com.capgemini.test;

import java.text.DateFormatSymbols;

public class Dateformatt {

	public static Object Convert(String date) {
		// TODO Auto-generated method stub
		String temp="";
		int len=date.length();
		for(int i=0;i<len;i++)
		{
			char ch=date.charAt(i);
			if(ch == ',')
			{
				temp=temp+'/';
			}
			else
			{
				temp=temp+ch;
			}
		}
		String n=""+temp.charAt(3)+temp.charAt(4);
		int month=Integer.parseInt(n);
		String mon="";
		switch(month)
		{
		case 1:
			mon="jan";
			break;
		case 2:
			mon="feb";
			break;
		case 3:
			mon="mar";
			break;
		case 4:
			mon="apr";
			break;
		case 5:
			mon="may";
			break;
		case 6:
			mon="jun";
			break;
		case 7:
			mon="jul";
			break;
		case 8:
			mon="aug";
			break;
		case 9:
			mon="sep";
			break;
		case 10:
			mon="oct";
			break;
		case 11:
			mon="nov";
			break;
		case 12:
			mon="dec";
			break;
		default:
			System.out.println("Enter a valid month");
		}
		String s=(temp.substring(0, 3)+ mon +temp.substring(5));
		return s;
	}
}
