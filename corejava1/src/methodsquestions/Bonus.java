/*1)	Let us Assume and do the programming: An organization provides Diwali bonus of 35% to their employees 
 *  If the year of service of that employee is more than 5 years and gives Diwali bonus of 15% to the employees if the year of service is less than 5 years. 
 *  Now Create a class and its respective methods to enter the data from the user and calculate total salary of the employee
 * 
 * */



package methodsquestions;

import java.util.Scanner;

public class Bonus {
	int year,sal;
	public void data() 
	
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
		year=sc.nextInt();
		System.out.println("enter a sal");
		sal=sc.nextInt();
	
	}
	public void display()
	{
		int totalsal,result;
		if(year<5)
		{
			result=(sal*15)/100;
		   totalsal = sal+result;
			System.out.println("salary of employee "+totalsal);
		}
		else
		{
			result=(sal*35)/100;
			totalsal = sal+result;
			System.out.println("salary of employee"+totalsal);
		}

					
			
	}

}
