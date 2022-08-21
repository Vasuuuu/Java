import java.util.Scanner;
public class Average_of_N_numbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N = input.nextInt();
        int sum = 0;
        int count = 0;
        for(int i = 1; i<=N;i++){
            System.out.print("Enter "+i+ " number : ");
            int num = input.nextInt();
            sum = sum + num;
            count++;
        }
        int average = sum/count;
        System.out.println("Average of given numbers is : "+average);
    }
}
