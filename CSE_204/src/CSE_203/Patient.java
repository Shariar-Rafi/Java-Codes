package CSE_203;

public class Patient {

	String name,gender;
	private int age;
	
	
	public Patient(String n, int a,String g) {
		this.name = n;
		this.age = a;
		this.gender = g;
	}
	
	public void grow(int year) {
		age = age + year;
	}
	
	public void visitDoctor(String symptom) {
		display();
		System.out.println("Visiting a doctor with following symptom:");
		System.out.println(symptom);
	}
	
	void display() {
		System.out.println(name+":"+age+":"+gender);
	}
	
	
	
	
}
