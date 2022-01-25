package mathamatics;

/**
 * Trailing Zero of N! factorial
 */
public class O06_TrailingZeros {
    //Redid - 1
    public int getTrailingZeros(int n) {
        if (n <= 0) {
            return 0;
        }
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }
        return count;
    }
}
