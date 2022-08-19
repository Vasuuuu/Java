import java.util.Scanner;
public class fibonacci{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int i = 0;
int firstnum=0;
int secondnum=1;

while(i < n){
System.out.print(firstnum +" ");
int nextnum = firstnum+secondnum;
firstnum=secondnum;
secondnum= nextnum;
i++;
}
}
}
