package beginerjava;
import java.util.Scanner;
public class primeDemo {

	public static void main(String[] args) {
	try(Scanner input=new Scanner(System.in)){
	
	
	int n;
	int count=0;
	System.out.print("Enter a positive integer: ");
	n=input.nextInt();
	
	if(n==0||n==1) {
		
		System.out.println("\nThe number is not prime.");
		}
	
	
	else 
	{
	for (int i = 2; i < n/2; i++) {
		
		if(n%i==0) {
			count++;
			break;
			
		}
	}
	if(count==0) {
		System.out.println("\nThe number is prime.");
	}
	
	else {
		System.out.println("\nThe number is not prime.");
	}
	
	}
	}
	
	
	}
	

}
