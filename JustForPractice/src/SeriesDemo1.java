import java.util.Scanner;
public class SeriesDemo1 {

	public static void main(String[] args) {

		try(Scanner input= new Scanner(System.in)){
			int n;
			System.out.print("Enter any posive integer: ");
		n=input.nextInt();
		
		for (int i = 2; i <=n; i=i+2) {
			System.out.print(" "+i);
		}
	
		

	}

}
}