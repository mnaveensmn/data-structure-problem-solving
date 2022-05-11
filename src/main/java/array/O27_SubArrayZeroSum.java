package array;

import java.util.HashSet;
import java.util.Set;

public class O27_SubArrayZeroSum {

    public boolean isZeroSumExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int preSum = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (preSum == 0 || arr[i] == 0 || set.contains(arr[i])) {
                return true;
            }
            set.add(preSum);
        }
        return false;
    }
}
