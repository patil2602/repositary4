//Write a program to display whether a character is an uppercase or lowercase alphabet. 

package scanner;

import java.util.Scanner;

public class Upperlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner uplow = new Scanner(System.in);

		System.out.println("enter the value of ch:");
		ch = uplow.nextLine().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("ch is uppercase");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("ch is lowercase");
		}
		else 
		{
			System.out.println("ch is invalid");
		}

}
}