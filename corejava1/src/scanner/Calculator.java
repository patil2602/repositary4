//Write a program to develop a simple calculator application and perform some basic operations

package scanner;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner zero = new Scanner(System.in);

		System.out.println("enter the value of a:");
		a = zero.nextInt();
		System.out.println("enter the value of b:");
		b = zero.nextInt();
		c=a+b;
		{
			System.out.println("value of a+b:"+c);
		}
		c=a-b;
		{
			System.out.println("value of a-b:"+c);
		}
		c=a*b;
		{
			System.out.println("value of a*b:"+c);
		}
		
	}

}
