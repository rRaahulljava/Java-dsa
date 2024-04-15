public class SetIthBit {
    public static int setIthBit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;

    }
  public static void main(String[] args) {
    // setIthBit(10, 2);
    System.out.println(setIthBit(10, 2));
    
  }   
}
