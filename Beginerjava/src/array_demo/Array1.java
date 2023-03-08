package array_demo;

public class Array1 {

	public static void main(String[] args) {
	   
		int [] number; //declaration
		number = new int[5]; //creation
		// another step:    int [] number = new int[10]


		number[0]=11;
		number[1]=13;
		number[2]=17;
		number[3]=12;
		number[4]=10;

		int sum= number[0]+number[1]+number[2]+number[3]+number[4];
	System.out.println("Sum = "+sum);
	int lenth=number.length;
	System.out.println("\nArray size = "+lenth);
	}

}
