package cse_204;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		try(Scanner input =new Scanner(System.in)){
			
			System.out.print("Enter any integer : ");
			int num = input.nextInt();
			
			if(num%2==0) {
				System.out.println();
				System.out.println(num+" is an even number.");
			}
			
			else {
				System.out.println();
				System.out.println(num+" is an odd number.");
		}
	 }
  }

}
