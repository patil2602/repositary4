//) Write a program to display and calculate profit or loss by a suitable example. 

package scanner;

import java.util.Scanner;

public class Profitloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sellprice,costprice;
		Scanner PL = new Scanner(System.in);

		System.out.println("enter the value of sellprice:");
		sellprice = PL.nextInt();
		System.out.println("enter the value of costprice:");
		costprice = PL .nextInt();
		if(sellprice>costprice)
		{
			System.out.println("profit");
		}
		else 
		{
			System.out.println("loss");
		}



	} 

}
