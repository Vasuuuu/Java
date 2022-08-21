import java.util.Scanner;
public class FibonacciSeries{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = input.nextInt();
    int first = 0;
    int second = 1;
    while(n>0){
        System.out.print(first + " ");
        int third = first + second;
        first = second;
        second = third;
        n--;
    }
}
}
