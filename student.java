import java.util.*;
public class student {
static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
     String a=getname();
     int b=getroll();
     String c=getBranch();
     System.out.println("Name: " + a);
     System.out.println("Roll No: " + b);
     System.out.println("Branch: " + c);
   }
   public static String getname(){
    System.out.print("Enter your name:");
    String name = sc.nextLine();
    return name;
   }
   public static int getroll(){
    System.out.print("Enter your roll no:");
    int rollno = sc.nextInt();
    return rollno;
   }
   public static String getBranch(){
    System.out.print("Enter your branch:");
    sc.nextLine(); // consume the leftover newline
    String branch = sc.nextLine();
    return branch;
   }
}
