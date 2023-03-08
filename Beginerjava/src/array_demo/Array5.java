package array_demo;
import java.util.Scanner;
public class Array5 {

	public static void main(String[] args) {
	try(Scanner input=new Scanner (System.in)){
		int[][] A =new int [2][3];
		int[][] B =new int [2][3];
		int[][] C =new int[2][3]; 
	
		//getting input for A matrix.
		System.out.println("Enter the values of A matrix : ");
		for (int row = 0; row < 2; row++) 
		{
		for (int col = 0; col < 3 ; col++) {
		System.out.printf("A[%d][%d] = ",row,col);
		A[row][col]=input.nextInt();
			
			
		}
	}	

		//getting input for B matrix.
		System.out.println("\nEnter the values of B matrix : ");
		for (int row = 0; row < 2; row++) 
		{
		for (int col = 0; col < 3 ; col++) {
			System.out.printf("B[%d][%d] = ",row,col);
		B[row][col]=input.nextInt();
					
		}
	}		
		
		
		

		//Printing input for A matrix.
		System.out.println();
		System.out.print("A = ");
		for (int row = 0; row < 2; row++) 
		{
		for (int col = 0; col < 3 ; col++) {
			
		System.out.print("\t "+A[row][col]);
			
			
		}
		System.out.println();
	}	
	
		System.out.println();
		
		//Printing input for B matrix.
		System.out.println();
		System.out.print("B = ");
		for (int row = 0; row < 2; row++) 
		{
		for (int col = 0; col < 3 ; col++) {
			
			
		System.out.print("\t  "+B[row][col]);
			
			
		}
		System.out.println();
	}
		
		
		

		
		
	
		
		//adding A & B matrix
		System.out.print("\nA+B = ");
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				C[row][col]=A[row][col]+B[row][col];
				System.out.print("\t "+(C[row][col]));
			}
			System.out.println();
		}
		
		
		
	}	
	

	}

}
