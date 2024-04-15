public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3};
        System.out.println(find(arr, 3, 0));
        
    }

    public static int find(int[] arr, int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = find(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
}
