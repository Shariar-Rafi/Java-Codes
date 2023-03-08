package Lab4_Problem2;
import java.util.Scanner;
public class BankApp {

public static void main(String[] args)
{
try(Scanner input = new Scanner(System.in))
{

	String name, accNum;
	double balance;
	
	BankAccount[] ba = new BankAccount[100];//declaring the size of array
	
	Mainloop:       //this is the master loop
		
		while(true)
			{
			System.out.println();
			System.out.print("1.Create a new Accounts\n2.Deposit\n3.Withdraw\n4.show balance\n5.display specific \n6. Display all \n0.exit\n> ");
			int option = input.nextInt();
			
			switch(option)
				{
				case 1://create new account
					System.out.print("Enter your name : ");
					name = input.next();
					System.out.print("Enter your account number : ");
					accNum = input.next();
					System.out.print("Enter your balance : ");
					balance = input.nextDouble();
					
					
					for(int i= 0; i<ba.length;i++)
					{
						if(ba[i]==null)
						{
						
						ba[i] = new BankAccount(name, accNum, balance);
						System.out.println("\nNew account created successfully!");
					break;
						}
						
						else
						{
						
						System.out.println("Account already exist!");
						}
					}
					break;
					
					case 2:
					System.out.println("Enter your account number : ");
					accNum = input.next();
					System.out.println("Enter the ammount to deposit money : ");
					balance = input.nextDouble();
					
					for(int i= 0; i<ba.length; i++)
					{
						if(ba[i]==null)break;
						if(ba[i].accNum.equals(accNum)) {
						ba[i].deposit(balance);
						break;
						}
					}
					
					break;
					
				case 3:
					System.out.println("Enter your account number : ");
					accNum = input.next();
					System.out.println("Enter the ammount to withdraw money : ");
					balance = input.nextDouble();
					
					for(int i= 0; i<ba.length; i++)
					{
						if(ba[i]==null)break;
						if(ba[i].accNum.equals(accNum))
						{
						ba[i].withdraw(balance);
						break;
						}
					}
					break;
					
				case 4:
					System.out.println("Enter your account number : ");
					accNum = input.next();
					
					for(int i= 0; i<ba.length; i++) 
					{
						if(ba[i]==null)break;
						if(ba[i].accNum.equals(accNum)) {
						double x = ba[i].getBalance();
						System.out.println(x);
						break;
						}
					}
					
					
					break;
				case 5:
					System.out.print("Enter an account number to view info : ");
					accNum = input.next();
					
					for (int i = 0;i<ba.length;i++) 
					{
						if(ba[i]==null)break;
						if(ba[i].accNum.equals(accNum))
						{
						System.out.println(ba[i]);
						}
					}
					break;
					
				case 6:
					System.out.println("\nAll account's info");
					System.out.println("------------------");
					System.out.println();
					for (int i = 0; i<ba.length; i++)
					{
						if(ba[i]==null)break;
						else {
						System.out.println(ba[i]);
						System.out.println();
						}
					}
					break;
					
				case 0:
					break Mainloop;
				}
			}


}
}
}