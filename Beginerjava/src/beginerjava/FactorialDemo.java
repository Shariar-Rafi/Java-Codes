package beginerjava;
import java.util.Scanner;
public class FactorialDemo{

	public static void main(String[] args) {
		try(Scanner input=new Scanner (System.in)){
	int num,fact=1;
	
	System.out.print("Enter any positive integer: ");
	num=input.nextInt();

		for(int i=num; i>=1; i--) {
			
			fact=fact*i;
		}
		
		System.out.println("\nFactoiral of "+num+" = "+fact);
	}
	}
}
