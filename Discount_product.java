import java.util.Scanner;
public class Discount_product{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the markedprice : ");
        double mp = input.nextDouble();
        System.out.print("Enter the discount rate : ");
        double dr = input.nextDouble();
        double discount = mp*dr/100;
        double amount = mp-discount;
        System.out.println("Discounted price of product : "+amount);
    }
}
