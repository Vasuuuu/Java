import java.util.Scanner;
public class SimpleInterest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
float p, t, r;
System.out.print("Enter principal amount : ");
p= input.nextFloat();
System.out.print("Enter time in years : ");
t = input.nextFloat();
System.out.print("Enter rate of interest : ");
r = input.nextFloat();
SI=(p*t*r)/100;
System.out.println("Simple Interest : "+SI);
}
}
