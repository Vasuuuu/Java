import java.util.Scanner;
public class PrimeNumsBetween2Nums{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lower bound of the interval : ");
        int lower = input.nextInt();
        System.out.print("Enter upper bound of the interval : ");
        int upper = input.nextInt();
        for(int i=lower;i<=upper;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isPrime(int n){
        if (n==0||n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i = 2; i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
