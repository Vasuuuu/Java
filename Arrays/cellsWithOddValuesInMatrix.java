import java.util.Arrays;
public class cellsWithOddValuesInMatrix{
    public static void main(String[] args){
        int m = 2;
        int n = 3;
        int[][] indices = {
            {0,1},
            {1,1}
        };
        System.out.println("Number of cells with odd values : "+oddCells(m,n,indices));
    }
    static int oddCells(int m,int n,int[][] indices){
        int[][] arr = new int[m][n];
for(int i=0;i<indices.length;i++){
    for(int j=0;i<indices[i].length;j++){
  int row = indices[i][j];
  for(int k=0;k<arr[i].length;k++){
      arr[row][k]++;
  }
  int col = indices[i][j+1];
  for(int k=0;k<arr.length;k++){
      arr[k][col]++;
  }
  
    }
}
int count = 0;
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        if((arr[i][j]%2)!=0){
            count++;
        }
    }
}
    //    indices = new int[m][n];
    //    int val = indices[0][1];
    //    return val;
    
   return count;
    }
}
