package beginerjava;
import java.util.Scanner;
public class LoopPractice3 {

	public static void main(String[] args) {
	try(Scanner input=new Scanner (System.in)){
	int sum =0;
	int m;
	int n;
	
	System.out.print("Enter initial number: ");
	m=input.nextInt();
	System.out.print("Enter final number: ");
	n=input.nextInt();

		for(int i=m; i<=n; i++) {
			
			if(i%2!=0) {
		sum=sum+i;	
		System.out.print("  "+i);
			}
			
		}
		
		System.out.println("\nSum = "+sum);
	}
	}
}
