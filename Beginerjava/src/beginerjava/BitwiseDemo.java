package beginerjava;

public class BitwiseDemo {

	public static void main(String[] args) {
int a,b,c;
a=32;
b=12;


c=a&b;
System.out.println("a&b = "+c);

c=a|b;
System.out.println("a|b = "+c);

c=a^b;
System.out.println("a^b = "+c);



c=a>>3;
System.out.println("a>>3 = "+c); //right shift

c=a<<3;
System.out.println("a<<3 = "+c); //left shift 


	}

}
