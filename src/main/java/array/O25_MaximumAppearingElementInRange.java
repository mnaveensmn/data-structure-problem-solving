package array;

import java.util.Arrays;

public class O25_MaximumAppearingElementInRange {

    public int maximumAppearingElementInGivenRange(int[] l, int[] r) {
        int m = l.length;
        int[] elementCount = new int[1000];
        for (int i = 0; i < m; i++) {
            elementCount[l[i]]++;
            if (r[i] < 999) {
                elementCount[r[i] + 1]--;
            }
        }
        int maxCount = elementCount[0];
        int result = 0;
        for (int i = 1; i < elementCount.length; i++) {
            elementCount[i] += elementCount[i - 1];
            if (maxCount < elementCount[i]) {
                maxCount = elementCount[i];
                result = i;
            }
        }
        return result;
    }
}
