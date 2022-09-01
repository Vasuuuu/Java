import java.util.*;
public class AddToArrayFormOfInteger{
    public static void main(String[] args){
        int[] num={1,2,0,0};
        int k = 34;
        List<Integer> kPlusNum=addToArrayForm(num,k);
        for(int i=0;i<kPlusNum.size();i++){
            System.out.print(kPlusNum.get(i));
        }
    }
    static List<Integer> addToArrayForm(int[] num,int k){
        int sum =0;
        for(int i=num.length-1;i>0;i--){
            sum=(sum*10)+num[i];
        }
        sum+=k;
        ArrayList<Integer> ans= new ArrayList<Integer>(num.length);
       for(int i=ans.size()-1;i>0;i--){
            while(sum>0){int r = sum%10;
            ans.add(r);
            sum=sum/10;}
        }
return ans;

 
    }
}
