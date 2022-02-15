package bitwise;

public class O02_PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0);
    }
}
