import java.util.Scanner;
import java.util.Arrays;
public class MultidimensionalArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows and columns in array: ");
       int row = input.nextInt();
       int col = input.nextInt();
       int n = row*col;
       int[][] arr = new int[row][col];
       System.out.print("Enter "+n+" elements in your array : ");
       for(row = 0; row<arr.length;row++){for(col = 0; col<arr[row].length;col++){
           arr[row][col]=input.nextInt();
       }}
       System.out.println("Your array : \n");
      for(row = 0; row<arr.length;row++){
        for(col = 0; col<arr[row].length;col++){
           System.out.print(arr[row][col]+"  ");
       }
        System.out.println();
    }
}
}
