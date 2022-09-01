public class matrixDiagonalSum{
    public static void main(String[] args){
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
    System.out.println("Sum of diagonal : "+diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat){
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
         sum += mat[i][i]+mat[i][n-(i+1)];
        }
        if(n%2!=0){
            return sum-(mat[n/2][n/2]);
        }else{
            return sum;
        }
    }
}
