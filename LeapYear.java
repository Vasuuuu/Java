import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = input.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==00)){
            System.out.println("Leap Year.");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
