package loops;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number upto which you want to display series");
		Scanner sc = new Scanner(System.in);
		int usernumber=sc.nextInt();
		int firstnumber,secondnumber,thirdnumber;
		firstnumber=0;
		secondnumber=1;
		System.out.print(firstnumber+" "+secondnumber);
		for(int i=0;i<=usernumber-2;i++)
		{
			thirdnumber=firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=thirdnumber;
			System.out.print(" "+thirdnumber);
		}
			
			

	}

}
