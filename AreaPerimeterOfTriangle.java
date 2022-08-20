import java.util.Scanner;
import java.lang.Math;
public class AreaTriangleSides {
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    System.out.print("Enter 3 values for 3 sides of triangle : ");
    double s1 = input.nextDouble();
  double s2 = input.nextDouble();
  double s3 = input.nextDouble();
  if (s1<0||s2<0||s3<0||s1+s2<=s3||s1+s3<=s2||s2+s3<=s1){
System.out.println("Invalid input.");
}else{
  double p = (s1+s2+s3)/2;
  double area = Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
  double perimeter = s1+s2+s3;
System.out.println("\nArea of rectangle : "+area+"\n");
System.out.println("\nPerimeter of rectangle : "+ perimeter);
}

      }
  }

  
