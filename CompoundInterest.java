import java.util.Scanner;
public class CompoundInterest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount, rate of interest and time span in years : ");
        double amount = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();
        double CI = amount*Math.pow((1+rate/100),time);
        System.out.println("Compound Interest : "+ CI);
    }
}
