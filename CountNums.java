import java.util.Scanner;
public class CountNums{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.print("Enter a digit to find how many times it occurs in your number : ");
        int digit = input.nextInt();
        int count=0;
       while(num>0){
           int r = num%10;
           if(r==digit){
               count++;
           }
           num = num/10;
           
           
       }
       System.out.println(digit+" occurs "+count+" times in given number.");
       
    }
}
