package beginerjava;
import java.util.Scanner;
public class Series3{

	public static void main(String[] args) {
		try(Scanner input=new Scanner (System.in)){
	int n,result=1;
	
	System.out.print("Enter the last number: ");
	n=input.nextInt();

		for(int i=1; i<=n; i=i+2)  //  1*3*5....*n
		{
			
			result=result*i;	
           System.out.print(i+" ");
		}
		
		System.out.println("\nResult = "+result);
	}
	}
}
