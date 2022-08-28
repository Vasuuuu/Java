import java.util.Scanner;
import java.util.Arrays;
public class Swap{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in integer array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n +" elements in array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
       System.out.println("Your integer array is : "+Arrays.toString(arr)); 
       System.out.println("Enter two index in array to swap : ");
       int index1 = input.nextInt();
       int index2 = input.nextInt();
       swap(arr,index1,index2);
       System.out.println("Your integer array after swapping : "+Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
}
}
