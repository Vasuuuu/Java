public class numbersWithEvenNumberOfDigits{
    public static void main(String[] args){
        int[] nums ={12,345,2,6,7896};
        System.out.println("Numbers with Even number of digits in array : "+findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int countdigits=0;
            while(n>0){
          //  int r = n%10;
            countdigits++;
            n=n/10;
            }
            if(countdigits%2==0){
                count++;
            }
        }
        return count;
    }
}
