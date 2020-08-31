package loopsquestions;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//logic = suppose 
int num,temp = 0;
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
for(int i=2;i<=num-1;i++)
{
	if(num%i==0)
	{
		temp=temp+1;
	
	}
}
if(temp==0)
	{
		System.out.println("num is prime");
	}
	else
	{
		System.out.println("num is not prime");
	}
}
	}


