import java.util.Scanner;
public class Prime{
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = imput.nextInt();
        if(num <= 1){
           System.out.println("Neither prime nor composite.");
        }
        int c = 2;
        while ( c * c <= num){
             if(num % c) == 0{
                System.out.println("Not Prime.");
                return;
             }
            c++;
        }
        if(c*c > num){
          System.out.println("Prime.");
        }
      }
}


          
