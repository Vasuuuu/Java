import java.util.*;
public class CGPA{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int sub = input.nextInt();
        float[] marks = new float[sub];
        System.out.print("Enter marks you got in each subject : ");
        float sum = 0;
        for(int i=0; i<sub;i++){
            marks[i]=input.nextFloat();
        }
        float[] grade = new float[sub];
        for(int i=0;i<sub;i++){
            grade[i]= marks[i]/10;
            sum = sum+grade[i];
        }
        System.out.println("\nMarks in all subjects : "+Arrays.toString(marks));
        System.out.println("\nGrade in all subjects : "+Arrays.toString(grade));
        float cgpa = sum/sub;
        System.out.println("\nCGPA : "+cgpa);
        float percentage = (float)9.5*cgpa;
        System.out.println("\nCGPA percentage : "+percentage);
    }
}
