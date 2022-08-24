import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        evenodd(num);
    }
    static void evenodd(int num){
        if(num%2==0){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
  }
}
