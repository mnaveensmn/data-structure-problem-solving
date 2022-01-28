package mathamatics;

public class O03_SieveOfEratosthenes {

    //Redid - 2
    public int[] primeNumbers(int n) {
        int finalPrimesCount = n - 1;
        int[] primes = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            primes[i] = 1;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i] == 1) {
                for (int j = i * 2; j <= n; j += i) {
                    if (primes[j] == 1) {
                        primes[j] = 0;
                        finalPrimesCount--;
                    }
                }
            }
        }
        if (finalPrimesCount < 0)
            return new int[]{};
        int[] finalPrimes = new int[finalPrimesCount];
        int primeIndex = 0;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == 1) {
                finalPrimes[primeIndex++] = i;
            }
        }
        return finalPrimes;
    }
}
