public class HighestAltitude{
    public static void main(String[] args){
        int[] gain={-5,1,5,0,-7};
        System.out.println(MaxHeight(gain));
    }
    static int MaxHeight(int[] gain){
        int max=0;
        int current=0;
        for(int i=0;i<gain.length;i++){
            current += gain[i];
            max = Math.max(current,max);
        }
        return max;
    }
}
