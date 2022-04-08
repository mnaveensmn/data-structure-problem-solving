package array;

public class O05_PrefixSumProblems {

    public int[] prefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }


    public int sumInRange(int[] arr, int start, int end) {
        int[] prefixSum = prefixSum(arr);
        if (start == 0) {
            return prefixSum[end];
        } else {
            return prefixSum[end] - prefixSum[start - 1];
        }
    }
}
