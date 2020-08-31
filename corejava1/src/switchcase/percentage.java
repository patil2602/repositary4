package switchcase;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1,sub2,sub3,sub4,sub5,sum,result;
		Scanner subject = new Scanner(System.in);

		System.out.println("enter the value of sub1:");
		sub1 = subject.nextInt();
		System.out.println("enter the value of sub2:");
		sub2 = subject.nextInt();
		System.out.println("enter the value of sub3:");
		sub3 = subject.nextInt();
		System.out.println("enter the value of sub4:");
		sub4 = subject.nextInt();
		System.out.println("enter the value of sub5:");
		sub5= subject.nextInt();
		sum=sub1+sub2+sub3+sub4+sub5;
		System.out.println("enter the value of sum:"+sum);
		result=(sum*100)/500;
		System.out.println("enter the value of result:"+result);
		
		if(result>=90)
		{
			System.out.println("grade A");
		}
		else if(result>=80)
		{
			System.out.println("grade B");
		}
		else if(result>=70)
		{
			System.out.println("grade C");
		}
		
		else if(result>=60)
		{
			System.out.println("grade D");
		}

		else if(result>=50)
		{
			System.out.println("grade E");
		}
		else if(result<40)
		{
			System.out.println("grade F");
		}

		else
		{
			System.out.println("grade IS INVALID");
		}


	}

}
	


