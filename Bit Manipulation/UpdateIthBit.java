public class UpdateIthBit {
    public static int upadateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitmask = newBit << i;
        return bitmask|n;

    }

    public static int clearIthBit(int n, int i){
        int bitmask = ~(1 << i);
        return n & bitmask;
     }

     public static int setIthBit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;

    }
    public static void main(String[] args) {
        System.out.println(upadateIthBit(8, 0, 1));
        
    }
}
