package bitwise;

public class O05_MaxAND {

    //redid - 2
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
        for (int bits = 31; bits >= 0; bits--) {
            int pattern = res | (1 << bits);
            count = countBit(a, pattern);
            if (count >= 2) {
                res |= pattern;
            }
        }
        return res;
    }
}
