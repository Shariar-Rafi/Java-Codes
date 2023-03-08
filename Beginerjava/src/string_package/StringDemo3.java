package string_package;

public class StringDemo3 {

	public static void main(String[] args) {
	String country =" Bangladesh is my country ";
	System.out.println(country);

	String s3 = country.trim();
	System.out.println(s3);
		char ch = country.charAt(0);
		System.out.println("ch : "+ch);
		
		int value = country.codePointAt(0);
		System.out.println("ASCII value : "+value);

		int pos=country.indexOf('n');
		System.out.println("First position of n : "+pos);

		pos = country.lastIndexOf('n');
		System.out.println("Last position of n : "+pos);


		
	}

}
