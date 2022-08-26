import java.util.Scanner;
public class PythagoreanTriplet{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 1st number : ");
    int n1=input.nextInt();
    System.out.print("Enter 2nd number : ");
    int n2 = input.nextInt();
    System.out.print("Enter 3rd number : ");
    int n3 = input.nextInt();
    isPythagoreanTriplet(n1,n2,n3);
    
}
 static void isPythagoreanTriplet(int n1,int n2,int n3){
     if(n1*n1 + n2*n2 == n3*n3 || n1*n1 + n3*n3 == n2*n2||n3*n3 + n2*n2 == n1*n1){
         System.out.println("It is a Pythagorean Triplet.");
     }else{
         System.out.println("It is not a Pythagorean Triplet.");
     }
 }
}
