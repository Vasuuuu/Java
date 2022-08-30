import java.util.Arrays;
public class NumberOfGoodPairs{
    public static void main(String[] args){
        int[] nums = {1,1,1,1};
        System.out.println("Number of good pairs in "+Arrays.toString(nums)+" is : "+numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums){
        int goodpairs = 0;
        for(int i = 0; i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                goodpairs++;
            }
        }
        }
        return goodpairs;
    }
}
