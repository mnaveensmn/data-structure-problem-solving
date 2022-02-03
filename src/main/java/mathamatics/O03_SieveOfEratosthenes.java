package mathamatics;

import java.util.ArrayList;
import java.util.List;

public class O03_SieveOfEratosthenes {

    //Redid - 3
    public int[] primeNumbers(int n) {
        int[] primes = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            primes[i] = 1;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i] == 1) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = 0;
                }
            }
        }
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == 1) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers.stream().mapToInt(i -> i).toArray();
    }
}
