import java.util.Scanner;
public class Rectangle {
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    System.out.print("Enter length of rectangle : ");
    double l = input.nextDouble();
    System.out.print("Enter breadth of rectangle : ");
double b = input.nextDouble();
System.out.println("Area of rectangle : "+l*b+"\n");
System.out.println("Perimeter of rectangle : "+ 2*(l*b));
  }
}
