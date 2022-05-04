package array;

public class O18_MaxLenEvenOddSubArray {

    public int maxLength(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = 1;
            for (int j = i + 1; j < n; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                    curr++;
                } else {
                    break;
                }
            }
            res = Math.max(res, curr);
        }
        return res;
    }

}
