//) Write a program to display whether a number is negative, positive or zero. 

package scanner;

import java.util.Scanner;

public class Positivenegativezero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner zero = new Scanner(System.in);

		System.out.println("enter the value of num:");
		num = zero.nextInt();
		if(num>0)
		{
			System.out.println("num is positive");
		}
		else if(num<0)
		{
			System.out.println("num is negative");
		}
		else
		{
			System.out.println("num is zero");
		}


	}

}
