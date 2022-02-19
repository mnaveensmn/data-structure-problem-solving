package bitwise;

public class O07_CountSetBit {

    public int naiveSolution(int n) {
        int res = 0;
        while (n > 0) {
            res += (n & 1);
            n = n >> 1;
        }
        return res;
    }
}
