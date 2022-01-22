package mathamatics;

public class O07_FactorialOfNumber {
    public int getFactorial(int n) {
        if (n==1){
            return 1;
        }
        return n * getFactorial(n-1);
    }
}
