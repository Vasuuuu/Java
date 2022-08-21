import java.util.Scanner;
public class Sum_Series_till_zero{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a series of integer (0 to quit) : ");
        int sum = 0;
        int num;
        while(( num = input.nextInt())!=0){
            sum= sum+num;
        }
        System.out.println("Sum : "+sum);
    }
}
