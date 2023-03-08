package UAP_HR;

public class UapHr {

	public static void main(String[] args) {
		

		Employee em1 = new Employee ("Julker","23100","HR", 80000.00);
		Employee em2 = new Employee ("Yamin","23101","Manager", 120000.00);
		

		double x = em1.getSalary();
		System.out.println("Salary of em1 is : "+x);
		System.out.println();
		em1.display();

	
		System.out.println();
		em2.display();


	em1.updateSalary(85000.00);
	
		System.out.println("\nAfter updating em1 salary : ");
		System.out.println("---------------------------");
		System.out.println();

		em1.display();
		

		
	}

}
