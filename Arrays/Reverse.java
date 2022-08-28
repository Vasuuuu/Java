import java.util.Scanner;
import java.util.Arrays;
public class Reverse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in integer array: ");
       int n = input.nextInt();
       int[] arr = new int[n];
       System.out.print("Enter "+n+" elements in your array : ");
       for(int i = 0; i<arr.length;i++){
           arr[i]=input.nextInt();
       }
       reverse(arr);
       System.out.println("Reversed array : "+Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
}
static void reverse(int[] arr){
    int start = 0;
    int end = arr.length-1;
    while(start<end){
        swap(arr,start,end);
        start++;
        end--;
    }
}

}
