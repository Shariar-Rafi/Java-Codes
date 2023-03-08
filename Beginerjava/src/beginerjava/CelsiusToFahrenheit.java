package beginerjava;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
	try(	Scanner input= new Scanner(System.in)){

		
double C,F;
		
		System.out.print("Celsius, C = ");
		C=input.nextDouble();
		
		
	    F = (1.8*C)+32;
	    System.out.println("\nFahrenheit = "+F);

		
	}
	}
}
