import java.util.Scanner;
public class SubtractProductAndSumOfDigits{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = input.nextInt();
    int n = num;
    int p = 1;
    int s = 0;
    while(n>0){
        int r = n%10;
        p = p*r;
        s = s+r;
        n = n/10;
        }
     int ans = p - s;
     System.out.print("(Product - Sum) of "+num+" is : "+ans);
}
}
