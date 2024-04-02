package Arrays;

public class SmallestNumber {
    public static int getSmallest(int[] arr ){
        int Smallst = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(Smallst > arr[i]){
                Smallst = arr[i];
            }
        }
        return Smallst;
    }
    public static void main(String[] args) {
        int[] arr = {0,-2,-4,-7,-8};
        System.out.println("largest is " + getSmallest(arr));
    }
}
