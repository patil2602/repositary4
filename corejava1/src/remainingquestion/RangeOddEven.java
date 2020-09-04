package remainingquestion;

import java.util.Scanner;

public class RangeOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first number of range");
		num1=sc.nextInt();
		
		System.out.println("enter the second number of range");
		num2=sc.nextInt();
		
		for(i=num1;i<=num2;i++)
		{
			if(i%2==0)
			{
				System.out.println("even="+i);
				
			}
			else
			{
				System.out.println("odd="+i);
				
			}
			
				
		}

	}

}
