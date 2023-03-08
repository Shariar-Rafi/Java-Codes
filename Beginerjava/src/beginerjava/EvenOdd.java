package beginerjava;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		try(Scanner input=new Scanner (System.in)){
		int num;
		System.out.print("Enter any positive integer: ");
num=input.nextInt();


if(num%2==0) {
System.out.print("Even");
}


else {
System.out.print("Odd");
}
		
		
	}
	}
}
