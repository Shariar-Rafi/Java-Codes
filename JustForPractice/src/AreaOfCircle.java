	import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		try(Scanner input= new Scanner(System.in)){
		double r;
		System.out.print("Enter the value of r: ");
		
		r=input.nextDouble();
		
		
		double area=3.1416*r*r;
		System.out.println("\nArea of the circle is = "+area);
		
		
		}
	}

}
