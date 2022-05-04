package array;

public class O19_MaxCircularSubArraySum {

    public int maxSum(int[] arr) {
        int n = arr.length;
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int currSum = arr[i];
            int currMax = arr[i];
            for (int j = 1; j < n; j++) {
                int index = (i + j) % n;
                currSum += arr[index];
                currMax = Math.max(currMax, currSum);
            }
            res = Math.max(res, currMax);
        }
        return res;
    }
}
