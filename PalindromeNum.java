import java.util.Scanner;
public class PalindromeNum{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int onum = input.nextInt();
int num = onum, sum = 0, r;
while(num>0){
r = num%10;
sum = (sum*10)+r;
num= num/10;
}
if(onum==sum){
System.out.println(onum+" is a Palindrome number.");
}else{
System.out.println(onum+" is not a Palindrome number.");
}
}
}
