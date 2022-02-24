package bitwise;

public class O13_RightMostDiffBit {

    public int rightMostDiffBitPosition(int m, int n) {
        if (m == n) {
            return -1;
        }
        int xor = m ^ n;
        int rms = xor & (-xor);
        return (int) Math.floor(Math.log(rms) / Math.log(2)) + 1;
    }
}
