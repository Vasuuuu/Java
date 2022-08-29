import java.util.Arrays;
public class ShuffleArray2{
public static int[] shuffle(int[] nums,int n){
    for(int i = 0; i<n;i++){
        nums[n+i]+=1005*nums[i];
    }
    for(int i = 0;i<n;i++){
        nums[2*i]=nums[n+i]/1005;
        nums[2*i+1]=nums[n+i]%1005;
    }
    return nums;
}
public static void main(String[] args){
        int[] nums ={1,2,3,1,2,3};
        System.out.println(Arrays.toString((shuffle(nums,3))));
    }
}
