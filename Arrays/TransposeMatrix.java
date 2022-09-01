import java.util.Arrays;
public class TransposeMatrix{
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] tm = TM(matrix);
for(int i=0;i<tm.length;i++){
        for(int j=0;j<tm[0].length;j++){
            System.out.print(tm[i][j]+" ");
    }
    System.out.println();
}}
    static int[][] TM(int[][] matrix){
        int matrixRow=matrix.length;
        int matrixCol=matrix[0].length;
        int[][] tm =new int [matrixCol][matrixRow];
        for(int i=0;i<matrixRow;i++){
        for(int j=0;j<matrixCol;j++){
            tm[i][j]=matrix[j][i];
        }
        }
        return tm;
    }
}
