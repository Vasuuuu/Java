import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find out if it is Even or Odd : ");
        int num = input.nextInt();
        if(isOdd(num)==true){
            System.out.println("Odd number.");
        }else{
            System.out.println("Even Number.");
        }
    }
    static boolean isOdd(int num){
        return (num & 1)==1;
    }
}
