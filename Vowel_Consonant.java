import java.util.Scanner;
//import java.lang.*;
public class Vowel_Consonant{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = Character.toLowerCase(input.next().charAt(0));
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("\nThis character is vowel.");
        }else if(c>=97&&c<=122){
            System.out.println("\nThis character is consonant.");
        }else{
            System.out.println("\nNeither vowel nor consonant.");
        }

    }
}
