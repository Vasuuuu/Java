import java.util.Scanner;
public class AreaOfParallelogram{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base and height of parallelogram : ");
        double base = input.nextDouble();
        double height = input.nextDouble();
        double area = base*height;
        double perimeter = 2(base+height);
        System.out.println("Area of parallelogram : "+area);
        System.out.println("Perimeter of parallelogram : "+perimeter);
    }
}
