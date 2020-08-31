//Write a program to input an alphabet and display whether it is a vowel or a consonant

package scanner;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner vow = new Scanner(System.in);

		System.out.println("enter the value of x:");
		ch = vow.nextLine().charAt(0);
		if(ch=='a'|| ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
		{
			System.out.println("ch is vowel");
		}
		else
		{
			System.out.println("ch is consonant");
		}

	}

}
