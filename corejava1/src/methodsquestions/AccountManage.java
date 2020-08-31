/* Write a program and perform the following steps: 
 * Create a class AccountManagement containing following 
 * methods: 
 * insertData() to insert account details ofcustomers,
 *  displayData() to display account details 
 *  depositAmount() to deposit amount of customer
    withdrawAmount() to withdraw amount 
    accountBalance() to checkbalance in customer’s account.
    The methods should execute as per their specification.
*/

package methodsquestions;

import java.util.Scanner;

public class AccountManage {
	
		Scanner sc = new Scanner(System.in);
		//instance variables
		String name;
		int accountNo,amount;
		
		void insertData()
		{
			
			System.out.println("Enter name of customer: ");
			name = sc.next();
			
			System.out.println("Enter account no: ");
			accountNo = sc.nextInt();	
		}
		
		
		
		void depositAmount()
		{
			int depositAmount; //local variable
			System.out.println("Enter amount to deposit: ");
			depositAmount = sc.nextInt();
			
			amount = depositAmount+amount;
			
		}
		
		void withdrawAmount()
		{
			int withdrawAmount;
			System.out.println("Enter the amount you want to withdraw:");
			withdrawAmount  = sc.nextInt();
			
			amount = amount- withdrawAmount;
			
		}
		
		void amountBalance()
		{
			System.out.println("Balance is : "+amount);
			
		}
		
		void displayData()
		{
			System.out.println("Customer Name: "+name);
			System.out.println("Customer Account number: "+accountNo);
			System.out.println("Account Balance is : "+amount);
		}
	}


