import java.util.Scanner;
public class DepreciationOfValue{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter initial value, rate of depreciation and time in years respectively : ");
        float V1 = input.nextFloat();
        float r = input.nextFloat();
        float t = input.nextFloat();
        float V2 = (float)(V1*(Math.pow((1-r/100),t)));
        System.out.println("Depreciated Value is : "+Math.round(V2));
    }
}
