import java.util.Arrays;
public class FipplingImage{
    public static void main(String[] args){
        int[][] image = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
       int[][] x =flipAndInvertImage(image);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] flipAndInvertImage(int[][] image){
        int m = image.length;
        int n = image[0].length;
        for(int i = 0;i<m;i++){
           for(int j=0;j<(n+1)/2;j++){
               int temp=image[i][j]^1;
            image[i][j]=image[i][n-j-1]^1;
            image[i][n-j-1]=temp;
           }
            
        }
        return image;
    }
}
