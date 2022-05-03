package array;

public class O18_MaxSubArraySum {

    public int maxSubArraySumUsingNaiveSolution(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                curr += arr[j];
                res = Math.max(curr, res);
            }
            System.out.println(i + " => " + res);
        }
        return res;
    }
}
