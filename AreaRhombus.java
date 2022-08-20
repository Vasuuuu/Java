import java.util.Scanner;
public class AreaRhombus{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of two diagonals of Rhombus : ");
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        double area = (d1*d2)/2;
        System.out.println("Area of parallelogram : "+area);
    }
}
