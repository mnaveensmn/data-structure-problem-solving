package bitwise;

/**
 * Count total set bit in all numbers from 1 to n
 */
public class O14_CountTotalSetBit {

    public int simpleSolution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                if ((num & 1) != 0) {
                    count++;
                }
                num >>= 1;
            }
        }
        return count;
    }
}
