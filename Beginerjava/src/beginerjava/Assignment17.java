package beginerjava;
import java.util.Scanner;
public class Assignment17 {

	public static void main(String[] args) {
		try(Scanner input=new Scanner (System.in)){
			
		
			System.out.print("Enter line number: ");
			int n =input.nextInt();
			for (int row = 1; row<=n; row++) {
				for (int col = 1; col <=row; col++) {
					System.out.print(" "+col%2);
				}
				System.out.println();
			}
			
			
		}
		
		
		
	}

}
