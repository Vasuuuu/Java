import java.util.Scanner;
public class BattingAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of runs scored, number of matches played and number of times player remained not out respectively : ");
        int runs = input.nextInt();
        int matches = input.nextInt();
        int notout = input.nextInt();
        int out = matches-notout;
        if (out>0){
            int batting_average= runs/out;
           System.out.println("Batting average of player is : "+ batting_average);
        }else{
            System.out.println("NA");
        }
    }
}
