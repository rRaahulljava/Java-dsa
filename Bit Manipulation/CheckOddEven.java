public class CheckOddEven {
    public static void OddOrEven(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        OddOrEven(4);
        OddOrEven(5);
    }
}
