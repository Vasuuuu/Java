import java.util.Scanner;
public class HCF_LCM{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int p = num1*num2;
        while (num1 != num2)
        {
        if (num1 > num2)
            num1 -= num2;
        else
            num2 -= num1;
        }
System.out.println("\nThe HCF: "+ num1);
System.out.println("The LCM: "+ p/num1);
    }
}
