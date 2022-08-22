import java.util.Scanner;
public class NcrAndNpr{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of N : ");
        int N = input.nextInt();
        System.out.print("Enter value of r : ");
        int r = input.nextInt();
        System.out.println("Value of "+N+"P"+r +" is : "+permutation(N,r));
        System.out.println("Value of "+N+"C"+r+" is : "+ combination(N,r));
    }
    static int fact(int n){
        int ans = 1;
        for(int i = 1; i<=n;i++){
            ans = ans * i;
        }
        return ans;
    }
    static int combination(int N, int r){
        return fact(N)/(fact(N-r)*fact(r));
    }
    static int permutation(int N, int r){
        return fact(N)/fact(N-r);
    }
}
