public class ClearIbits {
    public static int clearibits(int n, int i){
        int bitmask = (-1)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearibits(15, 2));
    }
}
