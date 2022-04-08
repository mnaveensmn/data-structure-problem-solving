package array;

/**
 * Given an array of integers of size 'n'.
 * Our aim is to calculate the maximum sum of 'k'
 * consecutive elements in the array.
 * Input  : arr[] = {100, 200, 300, 400}
 * k = 2
 * Output : 700
 */
public class O04_SlidingWindow {

    //redid - 1
    public int maxSumOfKElements(int[] arr, int k) {
        int windowSum = 0, i;
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        if (k > n) {
            return maxSum;
        }
        for (i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxWindowSum = windowSum;
        for (; i < n; i++) {
            int currWindowFirstIndex = i - k;
            windowSum = windowSum - arr[currWindowFirstIndex] + arr[i];
            if (windowSum > maxWindowSum) {
                maxWindowSum = windowSum;
            }
        }
        return maxWindowSum;
    }
}
