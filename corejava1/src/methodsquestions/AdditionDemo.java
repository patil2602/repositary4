/*4.	Create a class AdditionDemo having 3 instance variables number1 ,number2 and result.
a.	Create 4 methods as a) addition b) subtraction c) multiplication
d) division.
b.	Calculate different operations as per the methods determined above. Create objects of AdditionDemo from main method of another class Addition.
c.	Write a program to show the implementation and use of local, instance and static variables in different context.


*/
package methodsquestions;

public class AdditionDemo {
	int number1,number2,result;//instance variable
	public void addition()
	{
		int num1,num2,result;//local variable
		num1=20;
		num2=30;
		result=num1+num2;
		System.out.println("the addition of two numbers is:" +result);
	}
   public void subtraction()
   {
	   int num1,num2,result;//local variable
		num1=20;
		num2=30;
		result=num1-num2;
		System.out.println("the subtraction of two numbers is:" +result);
	}
   }
   

