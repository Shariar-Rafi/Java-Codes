package beginerjava;

public class MathDemo {
public static void main(String[]args) {
	
	
	int x =2;
	int y =3;
	int r=1;
	int max= Math.max(x, y);
	int min= Math.min(x, y);
	int absolute=Math.abs(y);
	double power = Math.pow(x, y);
	int round = Math.round(8.8f);
	double Area_of_circle=Math.PI*r*r;
	
	System.out.println("Maximum = "+max);
	System.out.println("Maximum = "+min);
	System.out.println("Absolute = "+absolute);
	System.out.println("x to the power y = "+power);
	System.out.println("round of 8.8 = "+round);
	System.out.println("Area of the circle is = "+Area_of_circle);
}

}
