package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O01_BitTacticsTest {

    private final O01_BitTactics bitTactics = new O01_BitTactics();

    @Test
    public void shouldSetBitAtNthPositionInGivenNumber() {
        int actual = bitTactics.setBit(16, 3);
        assertEquals(24,actual);
    }

}