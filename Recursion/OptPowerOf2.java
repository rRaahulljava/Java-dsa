public class OptPowerOf2 {
    public static int optPowerOf2( int x, int n){
        if(n == 0){
            return 1;
        }

      //  int halfPower = optPowerOf2(x, n/2) * optPowerOf2(x, n/2); // by using this line it will give O(n) tine complexity

      // its time complexity is O(logn) 
      int halfPower = optPowerOf2(x, n/2);
      int halfPowerSq = halfPower * halfPower;

        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) { 
        int ans = optPowerOf2(2, 4);
        System.out.println(ans+" ");
    }
}
