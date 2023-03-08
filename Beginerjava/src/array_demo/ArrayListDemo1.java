package array_demo;
import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();
		
		System.out.println("Initial Size : "+number.size());
		
		//adding elements
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(3, 40);
			System.out.println();
	
			
		
			
			System.out.print("Array list contains : ");
			
for(int x:number) {
		System.out.print(x+" ");
	}		
	
			
			
		System.out.println("\n\nSize : "+number.size());

	
		boolean check = number.isEmpty();
		System.out.println("\nArray list empty ? Ans: "+check);
		
		boolean contain = number.contains(30);
		System.out.println("\n30 is in the list ? Ans:"+contain);
		
		int pos = number.indexOf(40);
	System.out.println("\nThe index of 40 is "+pos);
	
		number.set(3, 50);  //replacing existed value if a index
	System.out.println("\nAfter replacing : "+number);
		
	int x = number.get(0);  //getting a value of a index
	System.out.println("\nIndex 0 = "+x);
	
	
	
	
	}
	

}
