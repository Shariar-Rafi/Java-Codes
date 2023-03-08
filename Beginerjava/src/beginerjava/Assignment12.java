package beginerjava;
import java.util.Scanner;
public class Assignment12 {

	public static void main(String[] args) {
		try(Scanner input=new Scanner(System.in)){
		
		int m;
		
	System.out.print("Enter the value of m: ");
	m=input.nextInt();
	
	int n;
	
	System.out.print("Enter the value of n: ");
	n=input.nextInt();
	
	
	
	int sum=0;

	
	for(int i=m; i<=n; i++) {
 
		if(i%2!=0){
		sum=sum+i;
		}
		
		
	}
	
	
System.out.println("\nSum of odd numbers m-n is: "+sum);
	
	
	}
	}
}
