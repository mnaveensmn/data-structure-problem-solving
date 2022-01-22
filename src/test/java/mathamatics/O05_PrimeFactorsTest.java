package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class O05_PrimeFactorsTest {

    @Test
    public void shouldReturnArrayOfPrimeFactorOfGivenNumber() {
        O05_PrimeFactors primeFactors = new O05_PrimeFactors();
        int[] actualPrimeFactor = primeFactors.getPrimeFactor(6);
        assertArrayEquals(new int[]{2, 3}, actualPrimeFactor);
        actualPrimeFactor = primeFactors.getPrimeFactor(10);
        assertArrayEquals(new int[]{2, 5}, actualPrimeFactor);
    }

}