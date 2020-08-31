//Write a program to display maximum among three numbers.

package scanner;

import java.util.Scanner;

public class Bigger {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner greater = new Scanner(System.in);
			int a,b,c;
			
			System.out.println("Enter the value of a: ");
			a = greater.nextInt();
			System.out.println("Enter the value of b: ");
			b = greater.nextInt();
			System.out.println("Enter the value of c: ");
			c = greater.nextInt();
			if (a>c)
			{
				System.out.println("the value of greater number is:"+a);
				
			}
			
			
			else if(b>c)
			{
				System.out.println("the value of greater number is:"+b);
				
			}
			else
			{
				System.out.println("the value of greater number is:"+c);
				
			}

	}

}
