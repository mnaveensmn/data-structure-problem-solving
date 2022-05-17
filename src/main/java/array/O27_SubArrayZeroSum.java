package array;

import java.util.HashSet;
import java.util.Set;

public class O27_SubArrayZeroSum {

    //redid -1
    public boolean isZeroSumExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int preSum = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (arr[i] == 0 || preSum == 0 || set.contains(preSum)) {
                return true;
            }
            set.add(preSum);
        }
        return false;
    }
}
