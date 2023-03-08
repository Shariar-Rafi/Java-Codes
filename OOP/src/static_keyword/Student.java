package static_keyword;

public class Student {


	String name;
	int id;
	static String universityName ="UAP";

	
	Student(String n, int m){   //initialization

		name = n;
		id = m;
		
	}
	
	void displayInformation() {
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
		System.out.println("University name : "+universityName);
		System.out.println();
	}
}
