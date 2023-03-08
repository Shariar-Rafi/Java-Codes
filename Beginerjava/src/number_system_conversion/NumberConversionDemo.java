package number_system_conversion;

import java.util.Scanner;

public class NumberConversionDemo {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a decimal value : ");
			int decimal = input.nextInt();

			String binary = Integer.toBinaryString(decimal);
			System.out.println("\nAfter coverting to binary : " + binary);

		}
	}
}
