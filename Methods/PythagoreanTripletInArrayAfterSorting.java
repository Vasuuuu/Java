import java.util.Scanner;
import java.util.Arrays;
public class PythagoreanTripletInArrayAfterSorting{
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
     for(int i = 0;i<num;i++){
         arr[i]=arr[i]*arr[i];
     }
     Arrays.sort(arr);
     System.out.println("Squared elements of your array : "+ Arrays.toString(arr));
     for(int i=num-1; i>=2;i--){
        int l=0;
        int r=i-1;
    while(l<r){
        if(arr[l]+arr[r]==arr[i]){
        System.out.println("\nPythagorean triplet present in array.");
        return true;
        }
        if(arr[l]+arr[r]<arr[i]){
        l++;
        }else{
        r--;
        }
    }
}
System.out.println("\nPythagorean Triplet not present in array.");
return false;
}
}
