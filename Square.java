import java.util.Scanner;
public class Square{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Square : ");
        double s = input.nextDouble();
        double area = s*s;
        double perimeter = 4*s;
        System.out.println("Area of Square : "+area);
        System.out.println("Perimeter of Square : "+perimeter);
    }
}
