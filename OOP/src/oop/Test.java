package oop;

public class Test {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher("Shariar Rafi", 22, "male", "01703561733"); // object declaration & creation //it																					// is a parametrized constructor
		teacher1.displayInformation();
		
		Teacher teacher2 = new Teacher("Anisul Islam", 35, "male", "01712345678");		
		teacher2.displayInformation();		
		
		Teacher teacher3 = new Teacher();		
		teacher3.displayInformation();

	}

}
