//4) Write a program to find factorial of a number. 
package loopsquestions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1,i,num;
		Scanner facto = new Scanner(System.in);
	
		System.out.println("enter a number");
		num = facto.nextInt();
		
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is:"+fact);
		
			
		
		
	}

}
