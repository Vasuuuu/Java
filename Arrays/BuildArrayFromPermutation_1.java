import java.util.Arrays;
public class BuildArrayFromPermutation_1{
    public static void main(String[] args){
        int[] nums = {0,2,1,5,3,4};
        int l = nums.length;
        for(int i = 0; i<l;i++){
            nums[i]=l*(nums[nums[i]]%l)+nums[i];
        }
        System.out.println(Arrays.toString(nums)+"\n");
        System.out.println("Original array : ");
        for(int i = 0; i<l;i++){
            System.out.print(nums[i]%l+" ");
        }
        System.out.println("\nAnswer array  : ");
        for(int i =0; i<l;i++){
            System.out.print(nums[i]/l+" ");
        }
    }
}
