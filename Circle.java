import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    System.out.print("Enter radius of circle : ");
    double r = input.nextDouble();
final double PI=3.14;  
System.out.println("Radius of circle : "+r+"\n");
System.out.println("Diameter of circle : "+2*r+"\n");
System.out.println("Area of circle : "+ PI*(r*r)+"\n");
System.out.println("Circumference of circle : "+ 2*(PI*r));
  }
}
