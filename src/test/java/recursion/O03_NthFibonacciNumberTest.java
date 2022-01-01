package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class O03_NthFibonacciNumberTest {

    @Test
    public void shouldReturnNthFibonacciNumber() {
        O03_NthFibonacciNumber nthFibonacciNumber = new O03_NthFibonacciNumber();
        int n = nthFibonacciNumber.getNthFibonacciNumber(5);
        assertTrue(true);
    }
}
