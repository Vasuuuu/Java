import java.util.Arrays;
public class ShuffleArray{
public static int[] shuffle(int[] nums,int n){
    int[] nums2 = new int[2*n];
    int j = 0;
    for(int i = 0; i<2*n;i=i+2){
        nums2[i]=nums[j];
        nums2[i+1]=nums[n+j];
        j++;
    }
    return nums2;
}
public static void main(String[] args){
        int[] nums ={1,2,3,1,2,3};
        System.out.println(Arrays.toString((shuffle(nums,3))));
    }
}
