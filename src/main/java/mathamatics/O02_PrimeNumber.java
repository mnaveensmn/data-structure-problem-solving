package mathamatics;

public class O02_PrimeNumber {

    public boolean isPrimeNumber(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
