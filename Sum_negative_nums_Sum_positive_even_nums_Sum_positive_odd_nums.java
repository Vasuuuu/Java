import java.util.Scanner;
public class Sum_negative_nums_Sum_positive_even_nums_Sum_positive_odd_nums{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter series of numbers (0 to end) : ");
        int num;
        int SumNegativeNumbers=0,SumPositiveEvenNumbers=0,SumPositiveOddNumbers=0;
        
while((num = input.nextInt())!=0){
            if(num<0){
                SumNegativeNumbers+=num;
            }else if(num>0 && num%2==0){
                SumPositiveEvenNumbers+=num;
            }else if(num>0 && num%2!=0){
                SumPositiveOddNumbers+=num;
            }
        }
        System.out.println("Sum of Negative numbers : "+SumNegativeNumbers);
        System.out.println("Sum of Positive Even Numbers : "+SumPositiveEvenNumbers);
        System.out.println("Sum of Positive odd Numbers : "+SumPositiveOddNumbers);
    }
}
