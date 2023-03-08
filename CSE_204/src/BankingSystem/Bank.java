package BankingSystem;

public class Bank {

	public static void main(String[] args) {


		BankAccount ba1 = new BankAccount("Shariar","20201058",5000.0);//creating new object
		
		ba1.withdraw(500);
		ba1.display();
		double x=ba1.getBalance();
	System.out.println("Your current balance after withdraw money : "+x+"/-");
	
	System.out.println();
	
	ba1.deposit(1000);
	ba1.display();
	double y=ba1.getBalance();
	System.out.println("Your current balance after deposit money : "+y+"/-");
	
	
	
		}		
	}

