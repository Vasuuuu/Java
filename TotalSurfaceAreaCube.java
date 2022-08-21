import java.util.Scanner;
public class TotalSurfaceAreaCube{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the length of cube : ");
    double l = input.nextDouble();
    double a = 6*l*l;
    System.out.println("Total surface area of Cube is : "+a);
}
}
