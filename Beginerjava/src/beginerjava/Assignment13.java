//find nth fibonacci number

package beginerjava;


import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
       try( Scanner input=new Scanner(System.in)){
        int n,
        first=0,
        second=1,
        fibo=0;
        System.out.println("which fibonacci number you want to see? ");
        n=input.nextInt();
        
        for(int i=3;i<=n;i++)
        {
           fibo=first+second;
           first=second;
           second=fibo;
        }
        System.out.println();
        System.out.println(fibo);
    }
}

}	 