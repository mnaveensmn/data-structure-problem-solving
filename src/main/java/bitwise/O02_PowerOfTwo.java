package bitwise;

public class O02_PowerOfTwo {

    //Redid - 1
    public boolean isPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0);
    }
}
