package array;

public class O16_TrappingRainWater {

    public int rainWaterCapacityUsingNaiveSolution(int[] arr) {
        int res = 0;
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            int lMax = arr[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }
            int rMax = arr[i];
            for (int j = i + 1; j < n; j++) {
                rMax = Math.max(rMax, arr[j]);
            }
            res += Math.min(lMax, rMax) - arr[i];
        }
        return res;
    }
}
