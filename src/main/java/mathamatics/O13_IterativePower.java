package mathamatics;

public class O13_IterativePower {

    //redid - 1
    public int pow(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = res * x;
            }
            x = x * x;
            n = n / 2;
        }
        return res;
    }
}
