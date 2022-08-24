import java.util.Scanner;
public class Vote{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        canVote(age);
    }
    static void canVote (int age){
        if(age>=18){
            System.out.print("You can vote.");
        }else{
            System.out.print("You are not eligible to vote.");
        }
  }
}
