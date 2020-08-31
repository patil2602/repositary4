//Write a program to display if the entered year is a leap year or not. 

package scanner;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner leap = new Scanner(System.in);
		year = leap.nextInt();
		System.out.println("enter a year");
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
					
				{
					System.out.println(" this year is leap year");
			    }
			
			     else
			    {
				     System.out.println(" this year is not leap year");
			    }
			}
			else
			{
				System.out.println(" this year is not leap year");
			}
		}
			else 
			{
				System.out.println(" this year is not leap year");
			}
	}

		

	}



