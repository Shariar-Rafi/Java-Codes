package string_package;

public class StringDemo4 {
public static void main(String[]args) {
	
	String s1="This_is_my_country";
	System.out.println(s1);
	
	String s2 = s1.replace('i', 'o');
	System.out.println(s2);

	String[] s3=s1.split("_");
	
for(String x:s3) {
	
	System.out.print(x);
}


	
}
}
