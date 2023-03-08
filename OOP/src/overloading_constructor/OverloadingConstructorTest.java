package overloading_constructor;

public class OverloadingConstructorTest {

	public static void main(String[] args) {

		Teacher teacher1 = new Teacher();
		
		Teacher teacher2 = new Teacher("Shariar Rafi","male");
		teacher2.displayInformation();

		
		Teacher teacher3 = new Teacher("Nasir Uddin Milon","male", 50);
		teacher3.displayInformation();

		
		
		
	}

}
