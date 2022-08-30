import java.util.Arrays;
public class NumberOfGoodPairs1{
    public static void main(String[] args){
        int[] nums = {1,1,1,1};
        System.out.println("Number of good pairs in "+Arrays.toString(nums)+" is : "+numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums){
        int[] frequency = new int[101];
        int goodpairs = 0;
        for(int i = 0; i<nums.length;i++){
        frequency[nums[i]]++;
        }
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>1){
                goodpairs=goodpairs+((frequency[i]-1)*frequency[i])/2;
            }
        }
        return goodpairs;
    }
}
