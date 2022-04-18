package array;

public class O07_KadaneAlgorithm {

    //redid - 1
    public int largestSumSubArray(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere += arr[i];
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }
}
