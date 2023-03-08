package cse_204;
import java.util.Scanner;

public class MaxMinDemo {

	public static void main(String[] args) {

		try(Scanner input = new Scanner(System.in)){
			
			System.out.print("Enter the fisrt number : ");
	        int a = input.nextInt();
	        
			System.out.print("Enter the second number : ");
	        int b = input.nextInt();
			
	        
	        int max=(Math.max(a, b));
	        int min=(Math.min(a, b));
	        
	        System.out.print("\nMax number is : "+max);
	        System.out.print("\nMin number is : "+min);

			
			
		}
	}

}
