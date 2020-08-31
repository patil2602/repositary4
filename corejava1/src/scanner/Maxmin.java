//Write a program to display maximum number and minimum number between two numbers. 

package scanner;

import java.util.Scanner;

public class Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner MAXIMUM = new Scanner(System.in);

		System.out.println("enter the value of a:");
		a = MAXIMUM.nextInt();
		System.out.println("enter the value of b:");
		b = MAXIMUM.nextInt();
		if(a>b)
		{
			System.out.println("the a is maximum");
		}
		else 
		{
			System.out.println("b is maximum");
		}


	}

}
