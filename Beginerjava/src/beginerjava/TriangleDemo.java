package beginerjava;
import java.util.Scanner;
public class TriangleDemo {

	public static void main(String[] args) {
	try(Scanner input= new Scanner(System.in)){
	
	double base,height,area;
	
	System.out.print("Input the value of the base: ");
	base=input.nextDouble();
	
	System.out.print("Input the value of the height: ");
    height=input.nextDouble();
	

    
    
    area = 0.5*base*height;
    System.out.println("Area of the triangle is: "+area);
	}
	}
}
