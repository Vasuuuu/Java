import java.util.Scanner;
public class Power{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int b = input.nextInt();
        System.out.print("Enter the Exponent : ");
        int e = input.nextInt();
        long p = 1;
        while(e>0){
            p = p*b;
            e--;
        }
         System.out.println("Answer : "+p);
    }
}
