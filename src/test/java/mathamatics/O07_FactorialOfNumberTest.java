package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O07_FactorialOfNumberTest {

    @Test
    public void shouldReturnAFactorialOfGivenNumber() {
        O07_FactorialOfNumber factorialOfNumber = new O07_FactorialOfNumber();
        int actual = factorialOfNumber.factorial(5);
        assertEquals(120,actual);
    }

    @Test
    public void shouldReturnAFactorialOfGivenNumber3() {
        O07_FactorialOfNumber factorialOfNumber = new O07_FactorialOfNumber();
        int actual = factorialOfNumber.factorial(3);
        assertEquals(6,actual);
    }

}