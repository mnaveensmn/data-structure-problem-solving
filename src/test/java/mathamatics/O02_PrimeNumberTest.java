package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class O02_PrimeNumberTest {

    @Test
    public void shouldDetermineWhetherGivenNumberIsPrimeOrNot() {
        O02_PrimeNumber primeNumber = new O02_PrimeNumber();
        boolean isPrime = primeNumber.isPrimeNumber(2);
        assertTrue(isPrime);
        isPrime = primeNumber.isPrimeNumber(3);
        assertTrue(isPrime);
        isPrime = primeNumber.isPrimeNumber(6);
        assertFalse(isPrime);
        isPrime = primeNumber.isPrimeNumber(7);
        assertTrue(isPrime);
        isPrime = primeNumber.isPrimeNumber(11);
        assertTrue(isPrime);
    }

}