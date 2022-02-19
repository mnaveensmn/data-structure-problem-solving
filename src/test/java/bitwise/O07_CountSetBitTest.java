package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O07_CountSetBitTest {

    @Test
    public void shouldCountOfSetBitUsingNaiveSolution() {
        O07_CountSetBit countSetBit = new O07_CountSetBit();
        int actual = countSetBit.naiveSolution(7);
        assertEquals(3, actual);
    }
}