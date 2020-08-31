//8) Write a program to check and display if a given number is palindrome or not. 
package loopsquestions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121 ,rem,rev=0;
		int temp=num;
	//	Scanner pali = new Scanner(System.in);
	
	//	System.out.println("enter a number");
	//	num = pali.nextInt();
		
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.println("the number is palindrome");
		}
		
			

	}

}
