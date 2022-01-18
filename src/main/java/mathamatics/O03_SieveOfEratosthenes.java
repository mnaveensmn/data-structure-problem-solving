package mathamatics;

public class O03_SieveOfEratosthenes {

    public int[] primeNumbers(int n) {
        int[] primes = new int[n + 1];
        /**
         *  0 to n = n+1.
         *  0,1 are non-prime numbers
         *  finalPrimesCount = n+1-2 = n-1
         */
        int finalPrimesCount = n - 1;
        for (int i = 2; i <= n; i++) {
            primes[i] = 1;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    if (primes[i * j] == 1) {
                        primes[i * j] = 0;
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
