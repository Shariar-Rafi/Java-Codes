import java.util.Scanner;
public class reverseInteger {
public static void main (String []args) {
try(Scanner input = new Scanner (System.in)) {
	
int num;
int sum=0;
System.out.print("Enter any positive integer: ");
num= input.nextInt();

int temp =num;
int r;

while(temp!=0) {
	 r=temp%10;

	sum=sum*10+r;
	temp=temp/10;
	
}

	System.out.println("\nResult: "+sum);
	
}		
}
}
