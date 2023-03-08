package beginerjava;
import java.util.Scanner;
public class armstrongNumberDemo {

	public static void main(String[] args) {
try(Scanner input = new Scanner(System.in)){

int num;
int sum=0;
System.out.print("Enter any positive integer: ");
num=input.nextInt();
int temp=num;
int r;



while(temp!=0) {
	 r=temp%10;

	sum=sum+r*r*r;
	temp=temp/10;
	
}
if(sum==num) {
	System.out.println("\nArmstrong. ");
	}

	else{
		System.out.println("\nNot armstrong number.");
	}
	}
}
	
}
