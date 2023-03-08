package Lab4_problem1;


public class BankAccount {
	
	
	public String name;
	public String accNum;
	public double balance;
	
	
	public BankAccount(String n,String an,double bl) {	
		this.name=n;
		this.accNum=an;
		this.balance=bl;
	
	}
	
	
	void deposit(double depAmount) {
		
		balance = (depAmount)+balance;	
	}
	
	
	
	
	void withdraw(double withAmount) {
		if(balance>=withAmount) {
			balance = balance - (withAmount);
		}
		else {
			System.out.println("Invalid amount!");
		}
	}
	

	double getBalance() {
		System.out.print("Your Current Balance : ");
		return balance;
	}
	
	
	public String toString() {
		return "Account Name : "+name+"\nAccount Number : "+accNum+"\nBalance : "+balance;
	
	}
	
}