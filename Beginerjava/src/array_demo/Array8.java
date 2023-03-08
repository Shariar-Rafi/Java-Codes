package array_demo;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {

		int [] number  = {10,-3,18,5,25};
		
		
		System.out.print("Ascending : ");

		Arrays.sort(number);
		for (int i = 0; i <=4; i++) {
			System.out.print(" "+number[i]);
		}
		
		System.out.println("\n");
		System.out.print("Decending : ");

		for (int i = 4; i >=0; i--) {
			System.out.print(" "+number[i]);
		}
		
		
		
		System.out.println("\n");
		
		String[] names = {"Rafi","Nuha","Lipi","Nasima"};
		
		Arrays.sort(names);
		
		for (int i = 0; i <=3; i++) {
			System.out.print(" "+names[i]);
		}
		
		System.out.println("\n");

		for (int i = 3; i >=0; i--) {
			System.out.print(" "+names[i]);
		}
		
		
		
	}

}
