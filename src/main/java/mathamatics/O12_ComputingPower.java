package mathamatics;

public class O12_ComputingPower {

    //Redid - 2
    public int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = pow(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        } else {
            return temp * x;
        }
    }
}
