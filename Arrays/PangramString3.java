import java.util.Arrays;
public class PangramString3{
    public static void main(String[] args){
        String str ="thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Pangram String : "+checkPangram(str));
    }
static boolean checkPangram(String str){
    for(char c='a';c<='z';c++){
        if(!str.contains(Character.toString(c))){
            return false;
        }
    }
    return true;
}
}
