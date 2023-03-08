package beginerjava;

public class IncreDecreDemo {

	public static void main(String[] args) {
	int x = 25;
	int y;
	
	y = ++x;//pre increment
	System.out.println("y = "+y); //x=26
	
	y= x;//post increment
  System.out.println("y = "+y); //x=26
  
  y = x--;//post decreament
	System.out.println("y = "+y); // x=26
	
	y= x;//post decrement
System.out.println("y = "+y); //x=25

	}

}
