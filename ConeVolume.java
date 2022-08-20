import java.util.Scanner;
public class ConeVolume{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius and height of cone respectively : ");
        double r = input.nextDouble();
        double h = input.nextDouble();
        final double PI= 3.14;
        double volume = (PI*r*r*h)/3;
        System.out.println("Volume of Cone: "+volume);
    }
}
