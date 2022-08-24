import java.util.Scanner;
public class Circle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        double r = input.nextDouble();
        System.out.println("Circumference : "+circumference(r));
        System.out.println("\nArea : "+area(r));
    }
    static double circumference(double r){
        return 2*3.14159*r;
    }
    static double area(double r){
        return 3.14159*r*r;
    }
}
