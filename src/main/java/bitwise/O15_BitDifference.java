package bitwise;

public class O15_BitDifference {

    //redid - 1
    public int countBitDifference(int a, int b) {
        int xor = a ^ b;
        int count = 0;
        while (xor > 0) {
            if ((xor & 1) != 0) {
                count++;
            }
            xor >>= 1;
        }
        return count;
    }
}
