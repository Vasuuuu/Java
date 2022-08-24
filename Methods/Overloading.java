public class Overloading{
    public static void main(String[] args){
       // fun(5);
       // fun("Vasu");
        int ans = sum(1,2,3);
        System.out.println(ans);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b,int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.print("First one : ");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.print("Second one : ");
        System.out.print(name);
    }
}
