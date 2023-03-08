package beginerjava;
import java.util.Scanner;
public class CicleDemo {

	public static void main(String[] args) {
	try(	Scanner input= new Scanner(System.in)){
		
		
		double r,area;
		
		System.out.print("Input the value of radious, r = ");
		r=input.nextDouble();
		
		
		area = 3.1416*r*r;
	    System.out.println("\nArea of the circle is = "+area);

	}
	}
}
