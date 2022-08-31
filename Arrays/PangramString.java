import java.util.Arrays;
public class PangramString{
    public static void main(String[] args){
        String str ="thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Pangram String : "+checkPangram(str));
    }
static boolean checkPangram(String str){
    boolean[] arr = new boolean[26];
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)>=97&&str.charAt(i)<=122){
            arr[(str.charAt(i))-97]=true;
        }
    }
    for(int i=0; i<arr.length;i++){
        if(arr[i]==false)return false;
    }
    return true;
}
}
