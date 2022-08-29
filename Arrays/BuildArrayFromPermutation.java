import java.util.Arrays;
public class BuildArrayFromPermutation{
    public static void main(String[] args){
        int[] nums = {0,2,1,5,3,4};
   //   int[] nums2 = {5,0,1,2,3,4};
        int l = nums.length;
        int[] ans = new int[l];
        for(int i = 0; i<l;i++){
            ans[i]=nums[nums[i]];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(ans));
    }
}
