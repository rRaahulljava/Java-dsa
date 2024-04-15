public class FrindPairing {
    public static int frndPair(int n){
        if(n ==1 || n == 2){
            return n;
        }

        return frndPair(n-1) + (n-1)*frndPair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(frndPair(3));
    }
}
