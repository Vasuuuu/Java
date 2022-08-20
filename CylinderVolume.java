import java.util.Scanner;
public class CylinderVolume{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius and height of Cylinder respectively : ");
        double r = input.nextDouble();
        final double PI = 3.14;
        double h = input.nextDouble();
        double volume = PI*r*r*h;
        System.out.println("Volume of Cylinder: "+volume);
    }
}
