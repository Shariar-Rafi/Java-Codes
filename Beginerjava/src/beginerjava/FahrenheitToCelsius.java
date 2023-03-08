package beginerjava;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		try (Scanner input= new Scanner(System.in)){

		
double C,F;
		
		System.out.print("Fahrenheit,F = ");
		F=input.nextDouble();
		
		
	    C = 0.555555556*(F-32);
	    System.out.println("\nCelsius= "+C);

		}	
	}

}
