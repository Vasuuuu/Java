import java.util.Scanner;
public class Largest_Smallest_In_3_nums{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("Maximum number is : "+max(num1,num2,num3));
        System.out.println("Minimum number is : "+min(num1,num2,num3));
    }
    static int max(int num1,int num2,int num3){
        int max = num1;
        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        return max;
        
    }
    static int min(int num1,int num2,int num3){
        int min = num1;
        if(num2<min){
            min = num2;
        }
        if(num3<min){
            min = num3;
        }
        return min;
    }
}
