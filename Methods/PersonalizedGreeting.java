import java.util.Scanner;
public class PersonalizedGreeting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.next();
        String personalised =myGreet(name);
        System.out.println(personalised);
        
    }
    static String myGreet(String name){
        String message = "Hello "+name+" !";
        return message;
        
    }
}
