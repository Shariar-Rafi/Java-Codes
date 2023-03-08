package array_demo;
import java.util.Scanner;
public class Matrix1 {

	public static void main(String[] args) {
	try(Scanner input=new Scanner (System.in)){
		int[][] A =new int [3][3];
		int sumOfDiagonalElements=0;
		int sumOfUpperTriangleElements =0;
		int sumOfLowerTriangleElements =0;

		
		//input
		for (int row = 0; row< 3; row ++) {
		
		for (int col = 0; col< 3; col ++) {
			System.out.printf("A[%d][%d] = ",row,col);

			A[row][col]=input.nextInt();
			
		}
		}
		
		//diagonal,upper,lower
		for (int row = 0; row< 3; row ++) {
		
		for (int col = 0; col< 3; col ++) {
			

			if(row==col){
				sumOfDiagonalElements = sumOfDiagonalElements + A[row][col];
			}
			
			if(row<col) {
				sumOfUpperTriangleElements=sumOfUpperTriangleElements + A[row][col];
			}
			
			if(row>col) {
				sumOfLowerTriangleElements=sumOfLowerTriangleElements + A[row][col];
			}
		
			
			
			
		}
		}
		
		
		
		
		
		System.out.println("\nSum of diagonal elements = "+sumOfDiagonalElements);
		System.out.println("\nSum of upper triangle elements = "+sumOfUpperTriangleElements);
		System.out.println("\nSum of lower triangle elements = "+sumOfLowerTriangleElements);

		
		
		
		
		
		
	}
	
	}

}
