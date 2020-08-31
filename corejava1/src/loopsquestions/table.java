package loopsquestions;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result,i,num;
		Scanner TABLE = new Scanner(System.in);
	
		System.out.println("enter a number");
		num = TABLE.nextInt();
		
		for(i=1;i<=10;i++)
		{
			result=num*i;
		
		System.out.println(num+"*"+i+"="+result);
		
		}	
		
		

	}

}
