import java.util.Arrays;
public class PangramString2{
    public static void main(String[] args){
        String str ="thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Pangram String : "+checkPangram(str));
    }
static boolean checkPangram(String str){
    int res=0;
    for(int i=0;i<str.length();i++){
        res |=(1<<(str.charAt(i))-1);
        if(res==((1<<26)-1)){
            return true;
        }
    }
    return false;
}
}
