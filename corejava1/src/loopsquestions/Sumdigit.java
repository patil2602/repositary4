package loopsquestions;

import java.util.Scanner;

public class Sumdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dig = new Scanner(System.in);
		int num,sum=0;
		System.out.println("Enter a number");
		num=dig.nextInt();
		while(num!=0)
		{
			
			sum= sum +num%10;
			num = num/10;
		}
		System.out.println("sum of digits:  "+sum);
		
	}

}
