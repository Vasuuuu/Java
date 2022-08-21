import java.util.Scanner;
public class PyramidVolume{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Base Length of Pyramid : ");
    double l = input.nextDouble();
    System.out.print("Enter the Base Width of Pyramid : ");
    double w = input.nextDouble();
    System.out.print("Enter the Height of Pyramid : ");
    double h = input.nextDouble();
    double v = (l*w*h)/3;
    System.out.println("Volume of Sphere is : "+v);
}
}
