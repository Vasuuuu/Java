import java.util.Scanner;
import java.util.Arrays;
public class PythagoreanTripletInArray{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of elements in your array : ");
    int num = input.nextInt();
    int[] arr = new int[num];
    System.out.print("Enter "+num+" elements : ");
    for(int i=0; i<num;i++){
        arr[i] = input.nextInt();
    }
    
    System.out.print("Your array : "+Arrays.toString(arr)+"\n");
    isPythagoreanTriplet(arr,num);
    
}
 static void isPythagoreanTriplet(int[] arr,int num){
     boolean flag = false;
     for(int i =0; i<num;i++){
         for(int j =i+1;j<num;j++){
             for(int k = j+1; k<num;k++){
                 int a = arr[i]*arr[i];
                 int b = arr[j]*arr[j];
                 int c= arr[k]*arr[k];
                 if(a==b+c||b==a+c||c==a+b){
                     flag = true;
                     
                 }else{
                     flag = false;
                     
                 }
             }
         }
     }
     if(flag){
           System.out.println("Pythagorean Triplet present in array.");
     }else{
         System.out.println("Pythagorean Triplet not present in array.");
     }
 }
}
