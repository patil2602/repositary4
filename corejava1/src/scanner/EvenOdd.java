//Write a program to display whether a number is even or odd. 

package scanner;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner eo = new Scanner(System.in);

		System.out.println("enter the value of num:");
		num = eo.nextInt();
		if(num%2==0)
		{
			System.out.println("num is even");
		}
		else
		{
			System.out.println("num is odd");
		}

	}

}
