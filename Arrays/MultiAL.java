import java.util.ArrayList;
import java.util.Scanner;
public class MultiAL{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows in ArrayList : ");
        int r = in.nextInt();
        System.out.print("Enter number of cols in ArrayList : ");
        int c = in.nextInt();
        int p = r*c;
        //columns initialising
        ArrayList<ArrayList<Integer>> list = new ArrayList<> (c);
        //rows initialisation
        for(int i = 0; i<r;i++){
            list.add(new ArrayList<>());
        }
        //add elements
        System.out.println("Add "+p+" elements to ArrayList : ");
        for(int i = 0; i<r;i++){
            for(int j =0; j<c;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
        
    }
}
