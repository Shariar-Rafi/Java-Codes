import java.util.Scanner;
public class EvenOddDemo1 {
public static void main(String[]args) {
	try(Scanner input =new Scanner (System.in)){
	
	int num;
	
	System.out.print("Enter a positive integer: ");
	num=input.nextInt();
	
	
	if(num%2==0) {
		 System.out.println("This is a even number. ");
		
	}
	else {
		
		
	System.out.println("This is odd number. ");
	}
		
	
}
	
	
}
	
}
