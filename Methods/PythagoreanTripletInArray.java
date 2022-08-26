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
    System.out.println(isPythagoreanTriplet(arr,num));
    
}
 static boolean isPythagoreanTriplet(int[] arr,int num){
     for(int i=0; i<num;i++){
         for(int j =i+1;j<num;j++){
             for(int k = j+1; k<num;k++){
                 int a = arr[i]*arr[i],b =arr[j]*arr[j],c= arr[k]*arr[k];
                 if(a==b+c||b==a+c||c==a+b){
                     System.out.println("Pythagorean triplet present in array.");
                     return true;
                 };
             }
         }
     }
    System.out.println("Pythagorean Triplet not present in array.");
    return false;
 }
}
