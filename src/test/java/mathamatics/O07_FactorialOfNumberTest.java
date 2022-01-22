package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O07_FactorialOfNumberTest {

    @Test
    public void shouldReturnAFactorialOfGivenNumber() {
        O07_FactorialOfNumber factorialOfNumber = new O07_FactorialOfNumber();
        int actual = factorialOfNumber.getFactorial(5);
        assertEquals(120,actual);
    }

}