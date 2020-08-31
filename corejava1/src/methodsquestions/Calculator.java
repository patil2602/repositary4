/*7.	Write a progam to create Calculator class which have methods addition(int num1,int
num2),subtraction(int num1,intnum2), multiplication(int num1, int num2), division(int num1, int num2) 
with return type double .Create a menu driven program and do perform these operations of a calculator by creating an object of this class and
 execute these methods from main method of another class.


 **/


package methodsquestions;

public class Calculator {
	public double addition(int num1,int num2) 
	{
		double result;
		result=num1+num2;
		System.out.println("addition is"+result);
		return result;
	}
	public double subtraction(int num1,int num2) 
	{
		double result;
		result=num1-num2;
		System.out.println("subtraction is"+result);
		return result;
	}
	public double multiplication(int num1,int num2) 
	{
		double result;
		result=num1*num2;
		System.out.println("multiplication is"+result);
		return result;
	}
	public double division(int num1,int num2) 
	{
		double result;
		result=num1/num2;
		System.out.println("division is"+result);
		return result;
	}

}
