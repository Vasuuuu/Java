import java.util.Scanner;
import java.util.Arrays;
public class Max{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //integer array's input and output
        System.out.print("Enter number of elements in integer array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n +" elements in array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
       System.out.println("Your integer array is : "+Arrays.toString(arr)); 
       System.out.println("Max : "+max(arr));
       System.out.println("Max in range of 1 and 3 : "+maxRange(arr,1,3));
    }
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
        
    }
    static int maxRange(int[] arr,int start, int end){
        if(start>end){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int maxVal = arr[start];
        for(int i = start;i<=end;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    
}
