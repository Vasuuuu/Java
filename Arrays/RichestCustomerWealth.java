public class RichestCustomerWealth{
public static int maximumWealth(int[][] accounts){
    int sum = 0;
    for (int i = 0; i < accounts.length; i++) { 
        int sumi=0;
    for(int j = 0; j<accounts[i].length;j++){
            sumi = sumi+accounts[i][j];
        }
        if(sumi>sum){
            sum=sumi;
        }
    }
    return sum;
}
public static void main(String[] args){
        int[][] accounts ={
            {2,8,7},
            {7,1,3},
            {1,9,5}
        };
        System.out.println(maximumWealth(accounts));
    }
}
