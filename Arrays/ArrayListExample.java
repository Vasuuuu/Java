import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExample{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<> (n);
       /* list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.contains(0)+"\n");
        System.out.println(list);
        list.set(0,100);
        System.out.println(list);
        list.remove(2);
        System.out.println(list); */
        
        System.out.println("Enter "+n+" elements in ArrayList : ");
        for(int i = 0; i<n;i++){
            list.add(in.nextInt());
        }
        System.out.println("Your ArrayList is : ");
    /*    for(int i =0; i<n;i++){
            System.out.print(list.get(i)+" ");
        } */
        System.out.println(list);
        
    }
}
