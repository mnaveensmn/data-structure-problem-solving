package bitwise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O14_CountTotalSetBitTest {

    @Test
    public void shouldReturnCountOfSetBitInAllNumbersUsingSimpleSolution() {
        O14_CountTotalSetBit countTotalSetBit = new O14_CountTotalSetBit();
        int actual = countTotalSetBit.simpleSolution(3);
        Assertions.assertEquals(4,actual);
        actual = countTotalSetBit.simpleSolution(6);
        Assertions.assertEquals(9,actual);
        actual = countTotalSetBit.simpleSolution(7);
        Assertions.assertEquals(12,actual);
    }

}