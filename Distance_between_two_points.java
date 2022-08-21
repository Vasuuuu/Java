import java.util.Scanner;
public class Distance_between_two_points{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x1, y1, x2, y2 respectively : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance between ("+x1+","+y1+") and "+"("+x2+","+y2+") is : "+distance);
    }
}
