package Arrays;

public class TrappingRainwater {
    public static int trappedwater(int[] heigth){
        int n =  heigth.length;

        // calculate left max boundary - array
        int[] leftmax = new int[n];
        leftmax[0] = heigth[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(heigth[i], leftmax[i - 1]);
        }

        // calculate right max boundary - array
        int[] rightmax = new int[n];
        rightmax[n -1] = heigth[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(heigth[i], rightmax[i+1]);
        }

        // loop
        int trappedwatre = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftmax bound , rightmax bound)
            int waterlevel = Math.min(leftmax[i], rightmax[i] );

            // trapped Water = water level - height[i]
            trappedwatre += waterlevel - heigth[i];
         }

        return trappedwatre;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedwater(height));
    }
}
