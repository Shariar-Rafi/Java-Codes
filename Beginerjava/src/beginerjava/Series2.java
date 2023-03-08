package beginerjava;
import java.util.Scanner;
public class Series2{

	public static void main(String[] args) {
		try(Scanner input=new Scanner (System.in)){
	int n,sum=0;
	
	System.out.print("Enter the last number: ");
	n=input.nextInt();

		for(int i=1; i<=n; i=i+1) {
			
			sum=sum+i*i;	
		System.out.print(i+"*"+i+"   ");
		}
		
		System.out.println("\nSum = "+sum);
	}
	}
}
