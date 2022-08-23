import java.util.Scanner;
public class LargestNum3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
       int num1 = input.nextInt();
       int num2 = input.nextInt();
       int num3 = input.nextInt();
      /* int max = num1;
        if(num2>max){
            max = num2;
        }
        if (num3>max){
            max = num3;
        } */
int max = Math.max(num3,Math.max(num1,num2)); 
       System.out.println("Largest number : "+max);
    }
}
