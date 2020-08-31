/*Write a program to input basic salary of an employee and calculate its Gross salary according to following: 
Basic Salary <= 10000: HRA = 20%,DA =80% 
Basic Salary <= 20000 : HRA = 25%, DA=90% 
Basic Salary > 20000 : HRA = 30%, DA =95% */


package scanner;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			
			
				Scanner sc = new Scanner(System.in);
				
				float basicSal,hra,da,grossSal;
				
				System.out.println("Enter basic salary of the employee: ");
				basicSal = sc.nextFloat();
				
				if(basicSal <= 10000)
				{
					hra = (basicSal*20)/100;
					da = (basicSal *80)/100;
					
					grossSal = basicSal+hra+da;
//					System.out.println("Gross salary of the employee is : "+grossSal);
				}
				else if(basicSal <=20000)
				{
					hra = (basicSal*25)/100;
					da = (basicSal*90)/100;
					grossSal = basicSal+hra+da;
//					System.out.println("Gross salary of the employee is : "+grossSal);
				}
				else
				{
					hra = (basicSal*30)/100;
					da = (basicSal*95)/100;
					grossSal = basicSal+hra+da;
//					System.out.println("Gross salary of the employee is : "+grossSal);
				}
				
				System.out.println("Gross salary of the employee is : "+grossSal);
				
				
				
				

	}

}
