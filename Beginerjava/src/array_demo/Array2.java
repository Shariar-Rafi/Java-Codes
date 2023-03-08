package array_demo;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
try(Scanner in=new Scanner(System.in)){
	double sum=0;
	double[] number = new double[5];
System.out.print("Please enter 5 numbers: ");
	 
for (int i = 0; i < number.length; i++) {
	number[i]=in.nextDouble();
}
//number[0]=1
//number[1]=2
//number[2]=3
//number[3]=4
//number[4]=5
	for (int i = 0; i < number.length; i++) {

		sum=sum+number[i]; //sum=1+2+3+4+5
		
	}
	
	System.out.println("\nSum = "+sum);
	
	double avg= sum/number.length;
System.out.println("Avarege = "+avg);

double max = number[0];
for (int i = 1; i < number.length; i++) {
	if(max<number[i]) {
		max = number[i];
	}
	
}
System.out.println("Maximum = "+max);




double min = number[0];
for (int i = 1; i < number.length; i++) {
	
	if(min>number[i]) {
		number[i]=min;
	}
	
}

System.out.println("Minimum = "+min);
	
}

	}

}
