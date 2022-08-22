import java.util.Scanner;
public class FutureInvestmentValue{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter present value : ");
        double pv = input.nextDouble();
        System.out.print("\nEnter the interest rate : ");
        double r = input.nextDouble();
        System.out.print("\nEnter the time period in years : ");
        double t = input.nextDouble();
        double fv = pv*Math.pow((1+r/100),t);
        System.out.println("Future value of investment : "+fv);
    }
}
