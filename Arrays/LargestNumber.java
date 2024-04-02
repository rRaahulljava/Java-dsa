package Arrays;

public class LargestNumber {
    public static int getLargest(int[] arr ){
        int largst = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(largst < arr[i]){
                largst = arr[i];
            }
        }
        return largst;
    }
    public static void main(String[] args) {
        int[] arr = {0,-2,-4,-7,-8};
        System.out.println("largest is " + getLargest(arr));
    }
}
