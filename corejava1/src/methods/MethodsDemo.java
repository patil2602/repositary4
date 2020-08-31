package methods;

public class MethodsDemo {
	//methods with no returntype with no arguments
	public void addition() 
	{
		int num1,num2,result;
		num1=20;
		num2=30;
		result=num1+num2;
		System.out.println("the addition of two numbers is:" +result);
	} 
	//methods with no returntype with  arguments
   public void subtraction(int num1,int num2) 
   {
	   int result;
	   result=num1-num2;
	   System.out.println("the subtraction of two numbers is:" +result);
	   
   }
 //methods with returntype with no arguments
   public int multiplication() 
   {
	   int num1,num2,result;
		num1=20;
		num2=30;
		result=num1*num2;
		System.out.println("the multiplication of two numbers is:" +result);
		return result;
   }
 //methods with returntype with  arguments
   public int division(int num1,int num2)
   {
	   int result;
	   result=num1/num2;
	   System.out.println("the subtraction of two numbers is:" +result);
	   return result;
	   
   }
}
