package bitwise;

public class O02_PowerOfTwo {

    //Redid
    public boolean isPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0);
    }
}
