import java.util.Scanner;
import java.math.*;
public class findArmstrongNum{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter two numbers as range for finding Armstrong numbers between that range : ");
int lower = input.nextInt();
int upper = input.nextInt();
System.out.print("Armstrong numbers between "+lower+" and "+ upper+ " are : ");
while (lower<=upper){
//count number of digits
int num = lower;
int n = 0;
while(num>0){
num= num/10;
n++;
}
//sum of nth power of digits
num = lower;
int powsum = 0;
while(num>0){
int r = num%10;
powsum = powsum + (int)Math.pow(r,n);
num = num/10;
}
// checking if powsum == lower
if (powsum == lower){
System.out.println(lower+ " ");}
lower++;
}
}
}
