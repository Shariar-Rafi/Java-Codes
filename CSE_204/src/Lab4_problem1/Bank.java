package Lab4_problem1;

import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		try (Scanner input = new Scanner (System.in))
		{
			
			System.out.print("Please enter you account name : ");
		String name =  input.next();
		
		System.out.print("Please enter you account number : ");
		String accNum =  input.next();
				
		System.out.print("Please enter you account balance : ");
		double balance =  input.nextDouble();

		BankAccount acc1 = new BankAccount(name,accNum,balance);
		
			System.out.println();
		System.out.println(acc1);

		System.out.println();
		
		MainLoop:
		while(true) {
			System.out.println();
		System.out.print("Enter 1 to deposit money\nor    2 to withdraw money\nor    3 to show balance\nor    0 to exit : ");
		int option = input.nextInt();
		switch(option) {
		  case 1:
			  System.out.println();
				System.out.print("Please a deposit ammount : ");
				double dm = input.nextDouble();
				acc1.deposit(dm);
				break;	
		  case 2:
			  System.out.println();
				System.out.print("Please a withdraw ammount : ");
				double wd = input.nextDouble();
				acc1.withdraw(wd);
				break;
		  case 3:
			  System.out.println();
				double x = acc1.getBalance();
				System.out.println(x);
				break;	
		  case 0:
			  break MainLoop;		    
		    }
		
		  }			
		}
	}

}