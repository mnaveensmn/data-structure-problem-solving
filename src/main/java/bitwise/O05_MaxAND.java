package bitwise;

public class O05_MaxAND {

    //redid - 1
    private int countBit(int[] a, int pattern) {
        int count = 0;
        for (int i : a) {
            if ((pattern & i) == pattern) {
                count++;
            }
        }
        return count;
    }

    public int findMaxANDValue(int[] a) {
        int res = 0, count;
        for (int bit = 31; bit >= 0; bit--) {
            int pattern = res | (1 << bit);
            count = countBit(a, pattern);
            if (count >= 2) {
                res |= pattern;
            }
        }
        return res;
    }
}
