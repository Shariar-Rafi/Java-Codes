package beginerjava;
import java.util.Scanner;
public class Assignment11 {

	public static void main(String[] args) {
		try(Scanner input=new Scanner(System.in)){
		
		int n;
	System.out.print("Enter the value of n: ");
	n=input.nextInt();
		
		int factorial=1;
		
		for(int i=1; i<=n; i++)
		{
			factorial=factorial*i;
			

			
			
		}
		
		
		
		
	System.out.println("\nFactorial of "+n+" is "+factorial);
		
	}
	}
}
