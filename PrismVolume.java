import java.util.Scanner;
public class PrismVolume{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length, breadth, height of Prism respectively : ");
        double l = input.nextDouble();
        double b = input.nextDouble();
        double h = input.nextDouble();
        double volume = l*b*h;
        System.out.println("Volume of Prism: "+volume);
    }
}
