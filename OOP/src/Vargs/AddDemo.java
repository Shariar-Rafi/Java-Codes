package Vargs;

public class AddDemo {

	
	
	int sum =0;
	void add(int ... num) {
		for(int x : num ) {
			
			sum = sum+x;
		
		}
	System.out.println(sum);
	
	
	
	
	
	
	}
}
