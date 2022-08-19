import java.util.Scanner;
public class SimpleCalculator{
public static void main(Strings[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter two numbers and an operator");
int num1 = input.nextInt();
int num2 = input.nextInt();
char op = input.nextChar();
if (op=='+'){
System.out.println("Sum is : "+ num1+num2);
}
if (op=='-'){
System.out.println("Difference is : "+ num1-num2);
}
if (op=='*'){
System.out.println("Product is : "+ num1*num2);
}
if (op =='/'){
System.out.println("Quotient is : "+ num1/num2);
}
}
}
