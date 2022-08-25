import java.util.Scanner;
public class MarksGrades{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks out of 100 : ");
        float marks = input.nextFloat();
        Grade(marks);
    }
    static void Grade(float marks){
        if(marks>=91&&marks<=100){
            System.out.println("AA");
        }else if(marks>=81&&marks<=90){
            System.out.println("AB");
        }else if(marks>=71&&marks<=80){
            System.out.println("BB");
        }else if(marks>=61&&marks<=70){
            System.out.println("BC");
        }else if(marks>=51&&marks<=60){
            System.out.println("CD");
        }else if(marks>=41&&marks<=50){
            System.out.println("DD");
        }else if(marks<=40){
            System.out.println("Fail");
        }
    }
}
