package mathamatics;

import java.util.ArrayList;
import java.util.List;

public class O05_PrimeFactors {

    public int[] getPrimeFactor(int n) {
        List<Integer> primeFactorList = new ArrayList<>();
        if (n % 2 == 0) {
            while (n % 2 == 0) {
                primeFactorList.add(2);
                n = n / 2;
            }
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                primeFactorList.add(i);
                n = n / 2;
            }
        }
        if (n>2){
            primeFactorList.add(n);
        }
        return primeFactorList.stream().mapToInt(i->i).toArray();
    }
}
