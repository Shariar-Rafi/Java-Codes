package BankingSystem;

public class BankAccount {

	public String name;
	public String id;
	public double balance;

	public BankAccount(String _name,String _id,double _balance) //constructor
	{
	  this.name = _name;
	  this.id= _id;
	  this.balance = _balance;
	}
	  	  
    //creating methods
	  public void deposit(double depAmount) {	  
		  balance += depAmount;	  
	  }
	  
	  public void withdraw(double withAmount) {	  
		  
		  if(balance>withAmount) {
			  balance -= withAmount;
					  }
		  else {
			  System.out.println("Ïnvalid ammount");
		  }
		  
		  }
	  	  
	  public double getBalance() {	  
		  return balance;
	  }
	  
	  
	  public void display() {	  
		 System.out.println("Name: "+name);
		 System.out.println("Id: "+id);
		 System.out.println("Balance: "+balance);

	  }

	}
 