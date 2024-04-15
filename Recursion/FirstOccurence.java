public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8,5};
        System.out.println(find(arr, 5, 0));
    }

    public static int find(int[] arr, int key, int i) {
       if(i == arr.length) {
        return -1;
       }
        if(arr[i] == key){
            return i;
        }
        return find(arr, key, i+1);
    }
}
