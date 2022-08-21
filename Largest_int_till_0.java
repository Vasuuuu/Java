import java.util.Scanner;
public class Largest_int_till_0{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a series of integer (0 to quit) : ");
        int sum = 0;
        int num;
        int largest = 0;
        while(( num = input.nextInt())!=0){
            if(num>largest){
                largest= num;
            }
        }
        System.out.println("Largest integer : "+largest);
    }
}
