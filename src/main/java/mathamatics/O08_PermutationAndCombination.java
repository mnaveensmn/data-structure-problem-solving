package mathamatics;

public class O08_PermutationAndCombination {

    private final O07_FactorialOfNumber factorial;

    public O08_PermutationAndCombination() {
        factorial = new O07_FactorialOfNumber();
    }

    public int permutation(int n, int r) {
        return factorial.getFactorial(n) / factorial.getFactorial(n - r);
    }

    public int combination(int n, int r) {
        return factorial.getFactorial(n) / (factorial.getFactorial(r) * factorial.getFactorial(n - r));
    }

}
