import java.util.Scanner;
public class SumPro2nums{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Sum : "+sum(num1,num2));
        System.out.println("\nProduct : "+pro(num1,num2));
    }
    static int sum(int num1, int num2){
        return num1+num2;
    }
    static int pro(int num1, int num2){
        return num1*num2;
    }
}
