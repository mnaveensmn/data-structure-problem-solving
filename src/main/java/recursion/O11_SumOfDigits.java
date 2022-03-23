package recursion;

public class O11_SumOfDigits {

    public int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }
}
