package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O01_BitTacticsTest {

    private final O01_BitTactics bitTactics = new O01_BitTactics();

    @Test
    public void shouldSetBitAtNthPositionInGivenNumber() {
        int actual = bitTactics.setBit(16, 3);
        assertEquals(24,actual);
        actual = bitTactics.setBit(5, 1);
        assertEquals(7,actual);
    }

    @Test
    public void shouldUnSetBitAtNthPositionInGivenNumber() {
        int actual = bitTactics.unSetBit(24, 3);
        assertEquals(16,actual);
        actual = bitTactics.unSetBit(7, 1);
        assertEquals(5,actual);
    }

}