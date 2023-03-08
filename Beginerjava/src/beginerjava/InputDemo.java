package beginerjava;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) 
	
	{
	try(Scanner input = new Scanner(System.in)){
	


double num1;

System.out.print("Enter the double value: ");
num1=input.nextDouble();
System.out.print("The value is "+num1);
}
	}
}
