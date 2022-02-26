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

    public int verticalFashionSolution(int n) {
        int i = 0;
        int ans = 0;
        while ((1 << i) <= n) {
            int change = 1 << i;
            boolean isBitSetVertically = false;
            for (int j = 0; j <= n; j++) {
                if (isBitSetVertically) {
                    ans++;
                }
                if (change == 1) {
                    isBitSetVertically = !isBitSetVertically;
                    change = 1 << i;
                } else {
                    change--;
                }
            }
            i++;
        }
        return ans;
    }
}
