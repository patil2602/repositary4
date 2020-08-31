package loopsquestions;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dig = new Scanner(System.in);
		int num,count=0;
		System.out.println("Enter a number");
		num=dig.nextInt();
		while(num>0)
		{
			num = num/10;
			count= count+1;
		}
		System.out.println("total digits of a number:  "+count);
		

	}

}
