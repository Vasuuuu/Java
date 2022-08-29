import java.util.Arrays;
import java.util.ArrayList;
public class KidsWithTheGreatestNumberOfCandiesUsingArrayList{
public static ArrayList<Boolean> kidsWithCandies(int[] candies,int extraCandies){
    ArrayList<Boolean> List = new ArrayList<Boolean>();
    int max = 0;
    for(int i =0; i<candies.length;i++){
        if(candies[i]>max){
            max=candies[i];
        }
    }
    for(int i = 0; i<candies.length;i++){
        int s = extraCandies+candies[i];
        if(s>=max){
          List.add(true);
        }else{
           List.add(false);
        }
    }
    return List;
}
public static void main(String[] args){
        int[] candies ={2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
