import java.util.Scanner;
import java.util.Arrays;
public class InputOutputArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //integer array's input and output
        System.out.print("Enter number of elements in integer array: ");
        int n = input.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter "+n +" elements in array : ");
        for(int i=0;i<nums.length;i++){
            nums[i]=input.nextInt();
        }
       /* System.out.println("Your integer array is : "+Arrays.toString(nums)); */
        
        System.out.print("Your integer array is : ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        } 
        //String array's input & output
       System.out.print("Enter number of elements in String array : ");
        n=input.nextInt();
        String[] str= new String[n];
        System.out.print("Enter "+n +" elements in array : ");
        for(int i=0; i<str.length;i++){
            str[i] = input.next();
        }
       /* System.out.println("Your String array is : "+Arrays.toString(str)); */
        
        System.out.println("Your String array is : ");
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }
}
