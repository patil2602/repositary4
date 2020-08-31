//Write a program to swap two variables

package com.jyotsna.basic;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =100;
		int num2 = 200;
		
		System.out.println("before swapping: ");
		System.out.println("num1 is : "+num1);
		System.out.println("num2 is : "+num2);
		
		int temp = num1;
		    num1 = num2;
		    num2 = temp;
		    
		    System.out.println("after swapping: ");
		    System.out.println("num1 is : "+num1);
           System.out.println("num2 is : "+num2);
	}

}
