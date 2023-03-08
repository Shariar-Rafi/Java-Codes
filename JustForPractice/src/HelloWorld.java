import java.util.Scanner;
public class HelloWorld {
  
  public static void main(String[] args){
    int id;
    String title;
    int price;
    String description;
    String category;

    System.out.print("id : ");
    Scanner input = new Scanner(System.in);
    id = input.nextInt();

    System.out.print("title : ");
    Scanner input2 = new Scanner(System.in);
    title = input2.nextLine();

    System.out.print("price : ");
    Scanner input3 = new Scanner(System.in);
    price = input3.nextInt();

    System.out.print("description : ");
    Scanner input4 = new Scanner(System.in);
    description = input4.nextLine();

    System.out.print("category : ");
    Scanner input5 = new Scanner(System.in);
    category = input5.nextLine();

    System.out.print("\n\nid : "+id);
    System.out.print("\ntitle : "+title);
    System.out.print("\nprice : "+price);
    System.out.print("\ndescription : "+description);
    System.out.print("\ncategory : "+category+"\n\n\n\n\n\n");


  }
}