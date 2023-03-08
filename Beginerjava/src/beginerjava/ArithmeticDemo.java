package beginerjava;

import java.util.Scanner;

public class ArithmeticDemo {
public static void main(String[]args)
{
	
try(Scanner input = new Scanner (System.in)){

int num1, num2,result;


	System.out.print("Enter first value: ");
	num1=input.nextInt();
	
	System.out.print("Enter second value: ");
	num2=input.nextInt();
	
	

	result=num1+num2;
	System.out.println("\n\nSum = "+result);
	
	result=num1-num2;
	System.out.println("Substraction = "+result);
	
	result=num1*num2;
	System.out.println("Multiplication = "+result);
	
	double result2=(double)num1/num2;
	System.out.println("Division = "+result2);
	
	result=num1%num2;
	System.out.println("Remainder = "+result);
	
	
}
	
}
}
