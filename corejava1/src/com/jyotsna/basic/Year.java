//Write a program to convert days into years, weeks and days.{Hint: Input-373
//days Output-1Year,1Weak,1day}

package com.jyotsna.basic;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=373;
		int num2=365;
		int year=373/365;
		int remainingdays=(373%365);
		int month=8/30;
		int week=8/7;
		int days=8%7;
		System.out.println("number of given days:"+num1);
		System.out.println("number of total days in one year:"+num2);
		System.out.println("number of year:"+year);
		System.out.println("number of remaining days:"+remainingdays);
		System.out.println("number of month:"+month);
		System.out.println("number of week:"+week);
		System.out.println("number of days:"+days);
	}

}
