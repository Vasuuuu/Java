import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       System.out.print("Enter a string : ");
       String str = input.nextLine();
       String nstr = "";
       char ch;
      for(int i = (str.length()-1); i>=0;i--){
          ch = str.charAt(i);
          nstr = nstr + ch;
      }
      System.out.println("Reversed String is : "+nstr);
    }
}
