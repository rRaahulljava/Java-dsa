public class IsPowTwo {
    public static boolean ispowTwo(int n){
        return (n & (n-1) )== 0;

    }
    public static void main(String[] args) {
        System.out.println(ispowTwo(64));
    }
}
