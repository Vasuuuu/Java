import java.util.Scanner;
public class SphereVolume{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius of Sphere : ");
    double r = input.nextDouble();
    double v = (4*3.14159*r*r*r)/3;
    System.out.println("Volume of Sphere is : "+v);
}
}
