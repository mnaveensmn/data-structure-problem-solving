package array;

public class O26_ThreeEqualSubArray {

    public String findSplit(int[] arr) {
        int preSum = 0;
        int i1 = -1, i2 = -1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 3 != 0) {
            return "-1";
        }
        int S1 = sum / 3;
        int S2 = 2 * S1;
        for (int i = 0; i < arr.length - 1; i++) {
            preSum += arr[i];
            if (preSum == S1 && i1 == -1) {
                i1 = i;
            } else if (preSum == S2 && i1 != -1) {
                i2 = i;
            }
        }
        return i1 + ", " + i2;
    }
}
