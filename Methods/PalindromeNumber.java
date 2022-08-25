import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.println("Palindrome number : "+isPalindrome(num));
    }
    static boolean isPalindrome(int onum){
        int num = onum, sum = 0;
        while(num>0){
            int r = num%10;
            sum = sum*10+r;
            num = num/10;
        }
        return onum == sum;
    }
}
