import java.util.Scanner;
public class CurvedSurfaceAreaCylinder{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius of Cylinder : ");
    double r = input.nextDouble();
    System.out.print("Enter the Height of Cylinder : ");
    double h = input.nextDouble();
    double v = 2*3.14159*r*h;
    System.out.println("Curved Surface area of Cylinder is : "+v);
}
}
