package beginerjava;

import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
	
	try(	Scanner input=new Scanner(System.in)){
		
		
	int m,n,count=0,totalPrime=0;
	System.out.print("Enter the initaial number: "); //m
	m=input.nextInt();
	System.out.print("Enter the last number: "); //n
	n=input.nextInt();
	
for (int i = m; i <=n; i++) //finding prime numbers between m to n
{
		for (int j = 2; j <= i-1; j++) 
		{
			if(i%j==0)
			{
				count++;
				break;
			}	
			
	
}
		if(count==0) {
			System.out.println(i);
	totalPrime++;

}	
count=0;
	} 
System.out.println("\nTotal prime numbers = "+totalPrime);

	}
}
}

