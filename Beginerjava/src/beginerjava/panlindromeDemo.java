package beginerjava;
import java.util.Scanner;
public class panlindromeDemo {
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

if(sum==num) {
	System.out.println("\nPalindrome.");
	
}

else
{
	System.out.println("Not palindrome.");
}

}		
}
}
