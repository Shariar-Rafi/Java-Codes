package beginerjava;
import java.util.Scanner;
public class Series1 {

	public static void main(String[] args) {
		try(Scanner input=new Scanner (System.in)){
	double n,sum=0;
	
	System.out.print("Enter the last number: ");
	n=input.nextDouble();

		for(double i=1.5; i<=n; i=i+1) {
			
			
		sum=sum+i;	
		System.out.print(i+"  ");
		}
		
		System.out.println("\nSum = "+sum);
	}
	}
}
