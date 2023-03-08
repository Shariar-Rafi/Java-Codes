import java.util.Scanner;
public class CalculaorDemo {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int a,b;
		

		System.out.print("Enter the first number: ");

		a=input.nextInt();
		
		System.out.print("Enter the second number: ");

		b=input.nextInt();
		
				int sum = a+b;
				System.out.println("\nSum = "+sum);
		
				int mul = a-b;
				System.out.println("\nMultiplication = "+mul);
		
				int multiply = a*b;
				System.out.println("\nMultiply = "+multiply);
				
				int divition= a/b;
				System.out.println("\nDivition = "+divition);
		
				
		
	}

}
