public class TillingProblem {
    public static int tile(int n){
        if(n ==0 || n == 1){
            return 1;
        }

        int fnm1 = tile(n-1);
        int fnm2 = tile(n - 2);
        
        int totways = fnm1+ fnm2;

        return totways;

    }
    public static void main(String[] args) {
        System.out.println(tile(4));
    }
}
