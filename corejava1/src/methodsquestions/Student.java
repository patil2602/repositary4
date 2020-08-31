//5.	Write a program to create a class Student and do the following:
//a.	Create a method to input data (rollNo, Name, contactNo, Total marks)
//b.	Create another method to display the data of Student class.
//c.	Create object of Student class and access these methods main method of a new class – StudentDemo.java.



package methodsquestions;

import java.util.Scanner;

public class Student {
	int rollNo,contactNo,totalmarks;
	String name;
	Scanner sc=new Scanner(System.in);
	public void inputData()
	{
		//int rollNo,contactNo,totalmarks;
		System.out.println("enter a rollNo");
		rollNo=sc.nextInt();
		System.out.println("enter a name");
		name=sc.next();
		System.out.println("enter a contactNo");
		contactNo=sc.nextInt();
		System.out.println("enter a totalmarks");
		totalmarks=sc.nextInt();
		
	}
	public void display()
	{
		System.out.println(" rollNo is "+rollNo );
		System.out.println(" name is " +name);
		System.out.println("contactNo is" +contactNo);
		System.out.println(" totalmarks is" + totalmarks);
	}

}
