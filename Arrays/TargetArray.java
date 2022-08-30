import java.util.Arrays;
public class TargetArray{
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index){
        int n = nums.length;
        int[] target = new int[n];
        for(int i=0;i<n;i++){
            if(index[i]>=i){
                target[index[i]]=nums[i];
            }else{
                rightShift(target,index[i],n);
                target[index[i]]=nums[i];
            }
        }
        return target;
    }
    static void rightShift(int[] arr,int index,int n){
        for(int i = n-1;i>index;i--){
            arr[i]=arr[i-1];
        }
    }
}
