import java.util.Scanner;
public class PerfectNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num%i==0){
                sum += i;
            }
        }
        if(num==sum){
            System.out.print("Perfect number.");
        }else{
            System.out.print("Not a perfect number.");
        }
    }
}
