import java.util.Scanner;
public class Sum_first_N_natural_numbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.print("Sum of first "+num+" natural numbers is : "+Sum(num));
    }
    static int Sum(int num){
        int sum = 0;
        for(int i=1; i<=num;i++){
            sum = sum + i;
        }
        return sum;
    }
}
