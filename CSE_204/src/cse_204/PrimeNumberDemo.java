package cse_204;
import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		try(Scanner input = new Scanner(System.in)){
			
			
			int count=0;

			System.out.print("Enter any integer : ");
	        int num = input.nextInt();

			for (int i = 2; i < num; i++)
			    {
				
				if(num%i==0) {
					count++;
					break;
					
				}
				
			    }
				
				if(count==0)
				{
					System.out.println();
					System.out.println(num+" is a prime number.");
				}
				
				
				
				else
				{
					System.out.println();
					System.out.println(num+" is not a prime number.");
				}
				
			}
	     }
	}

