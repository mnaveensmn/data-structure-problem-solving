package mathamatics;

public class O07_FactorialOfNumber {

    // Recursive methods for finding factorial is extra over head as it uses the stack memory
    //    public int factorial(int n) {
    //        if (n<=1){
    //       return 1;
    //        }
    //        return n * factorial(n-1);
    //    }
    //Redid - 1
    public int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public int tailRecursionFactorial(int n) {
        return tailRecursionFactorial(n, 1);
    }

    public int tailRecursionFactorial(int n, int result) {
        if (n == 0) {
            return result;
        }
        return tailRecursionFactorial(n - 1, n * result);
    }

}
