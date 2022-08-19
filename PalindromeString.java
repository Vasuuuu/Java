
import java.util.Scanner;
public class PalindromeString{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
String str = input.nextLine();
String reverse = "";
int strlen = str.length();
for(int i= (strlen-1); i >=0; --i){
reverse = reverse + str.charAt(i);
}
if (str.toLowerCase().equals(reverse.toLowerCase()))
{
System.out.println(str + " is a Palindrome String.");
}else{
System.out.println(str + " is not a Palindrome String.");
}
}
}
