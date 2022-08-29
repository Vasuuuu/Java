import java.util.Arrays;
public class RunningSumOf1DArray{
public static int[] runningSum(int[] nums){
        int n = nums.length;
        int sum = 0;
        int[] ans = new int[n];
        for(int i = 0; i<n;i++){
            sum=nums[i]+sum;
            ans[i]=sum;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums ={1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
