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

    public int brianKerringamsAlgorithm(int n) {
        int res = 0;
        while (n > 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }

    public int lookUpTableMethod(int n) {
        int res = 0;
        int[] table = new int[256];
        table[0] = 0;
        for (int i = 1; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
        res= table[n & 0xff];
        n = n>>8;
        res += table[n & 0xff];
        n = n>>8;
        res += table[n & 0xff];
        n = n>>8;
        res += table[n & 0xff];
        return res;
    }
}
