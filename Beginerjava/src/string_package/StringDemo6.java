package string_package;

public class StringDemo6 {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Shariar");
		
		System.out.println("str = "+str);

		str.append(" Rafi");
		
		System.out.println("str = "+str);

		str.delete(2, 5);
		System.out.println(str);

		
	}

}
