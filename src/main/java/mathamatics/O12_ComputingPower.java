package mathamatics;

public class O12_ComputingPower {

    public int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = pow(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        }
        return temp * x;

    }
}
