/*2)	Assume another company which is a laptop manufacturer company needs to develop laptopswhich does the following: On unlocking thescreen it will display a “WELCOME” message first, After “ welcome “ message displays →
“Enter Option:”
1.	Add-1
2.	Subtract-2
3.	Multiply-3
4.	Quit-4
The user should be allowed to enter an option. If the user enters 1, a message needs to be displayed,
3)	“Enter two numbers to be added”.
a.	The user should be allowed to enter two numbers (In two separate lines).
b.	Based on the numbers entered, the program should add and display the result as below
c.	“The result is<result>”
d.	After the result is displayed, the program should loop back and ask for the next menu entry. If the user enters 4, the program should quit. (The program needs to be executed and do either one of the options until the kid enters theoption4)


*/
package methodsquestions;

import java.util.Scanner;

public class EnterOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,result,num;
		int digit;
		Scanner options= new Scanner(System.in);
		System.out.println("welcome");
		
		for(digit=1;digit<=5;digit++) {
			System.out.println("Enter options \n 1)add \n 2)subtract \n 3)multiply \n 4)quit");
			digit=options.nextInt();
			
		switch(digit) 
		{
		case 1: 
			System.out.println("enter the value of num1");
			num1=options.nextInt();
			
			System.out.println("enter the value of num2");
			num2=options.nextInt();
			
			result=num1+num2;
			System.out.println("addition of two numbers is:" +result);
			
			break;
			
		case 2: 
			System.out.println("enter the value of num1");
			num1=options.nextInt();
			
			System.out.println("enter the value of num2");
			num2=options.nextInt();
			
			result=num1-num2;
			System.out.println("subtraction  of two numbers is:" +result);
			
			break;
			
		case 3: 
			System.out.println("enter the value of num1");
			num1=options.nextInt();
			
			System.out.println("enter the value of num2");
			num2=options.nextInt();
			
			result=num1*num2;
			System.out.println("multiplication of two numbers is:" +result);
			
			break;
			
		case 4: 
			System.out.println(" the operation is Quit");
			
			break;
			
			default:
				System.out.println(" invalid choice");
				break;
				
			
			
			
		}
		//else
	//	{
	//		System.out.println("screen is lock");
	//	}

	}

}
}