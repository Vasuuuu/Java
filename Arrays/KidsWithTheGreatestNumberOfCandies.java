import java.util.Arrays;
public class KidsWithTheGreatestNumberOfCandies{
public static boolean[] kidsWithCandies(int[] candies,int extraCandies){
    boolean[] sum = new boolean[candies.length];
    int max = 0;
    for(int i =0; i<candies.length;i++){
        if(candies[i]>max){
            max=candies[i];
        }
    }
    for(int i = 0; i<candies.length;i++){
        int s = extraCandies+candies[i];
        if(s>=max){
            sum[i]=true;
        }else{
            sum[i]=false;
        }
    }
    return sum;
}
public static void main(String[] args){
        int[] candies ={2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(Arrays.toString((kidsWithCandies(candies,extraCandies))));
    }
}
