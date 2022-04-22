package array;

public class O13_MaxDifference {

    public int findMaxDifference(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return Integer.MIN_VALUE;
        }
        int res = arr[1] - arr[0];
        int minValue = arr[0];
        for (int j = 1; j < n; j++) {
            res = Math.max(res, arr[j] - minValue);
            minValue = Math.min(minValue, arr[j]);
        }
        return res;
    }
}
