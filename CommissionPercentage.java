import java.util.Scanner;
public class CommissionPercentage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double a = input.nextDouble();
        System.out.print("Enter the Commission amount : ");
        double ca = input.nextDouble();
        double cp = (ca/a)*100;
        System.out.println("Commission Percentage is : "+cp+"%");
    }
}
