package bitwise;

import java.util.Arrays;

public class O10_TwoOddOccurring {

    //redid - 1
    public int[] efficientSolution(int[] a) {
        int[] res = new int[2];
        int xor = 0;
        for (int element : a) {
            xor ^= element;
        }
        int lastSetBit = xor & (-xor);
        for (int element : a) {
            if ((element & lastSetBit) != 0) {
                res[0] ^= element;
            } else {
                res[1] ^= element;
            }
        }
        Arrays.sort(res);
        return res;
    }
}
