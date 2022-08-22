import java.util.Scanner;
public class AverageMarks{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int sub = input.nextInt();
        float[] marks = new float[sub];
        System.out.println("\nEnter marks for each subject : ");
        float sum = 0;
        for(int i =0; i<sub;i++){
            marks[i]=input.nextFloat();
            sum = sum + marks[i];
        }
        float avg = sum/sub;
        System.out.println("\nAverage marks is : "+avg);
    }
}
