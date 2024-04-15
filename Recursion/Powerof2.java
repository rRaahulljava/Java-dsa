public class Powerof2 {
    public static int powerof2(int x, int n){
        if(n == 0){
            return 1;
        }  
        return x * powerof2(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2;
        System.out.println(powerof2(x, 4));
    }
}
