//Write a program to display whether the triangle is equilateral, isosceles or scalene triangle. 

package scanner;

import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a,b,c;
			Scanner side = new Scanner(System.in);

			System.out.println("enter the value of a:");
			a = side.nextInt();
			System.out.println("enter the value of b:");
			b = side.nextInt();
			System.out.println("enter the value of c:");
			c = side.nextInt();
			if(a==b&&a==c&&c==b)
			{
				System.out.println("traingle is equilqteral");
			}
			else if((a==b&&b!=c)||(a==c&&b!=c)||(b==c&&c!=a))
			{
				System.out.println("traingle is isocescle");
			}
			else if(a!=b&&b!=c&&c!=a)
			{
				System.out.println("traingle is scalen");
			}
		

	}

}
