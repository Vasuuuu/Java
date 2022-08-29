import java.util.Arrays;
public class ShuffleArrayBitwiseOperators{
public static int[] shuffle(int[] nums,int n){
    for(int i = 0; i<n;i++){
        nums[n+i]<<=10;
        nums[n+i] |= nums[i];
    }
    for(int i = 0;i<n;i++){
        int n1 = nums[n+i]&1023;
        int n2 = nums[n+i]>>10;
        nums[2*i]=n1;
        nums[2*i+1]=n2;
    }
    return nums;
}
public static void main(String[] args){
        int[] nums ={1,2,3,1,2,3};
        System.out.println(Arrays.toString((shuffle(nums,3))));
    }
}
