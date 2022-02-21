package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O08_OneOddOccurringTest {

    @Test
    public void shouldOneOccurringElementInGivenArray() {
        O08_OneOddOccurring oneOddOccurring = new O08_OneOddOccurring();
        int actual = oneOddOccurring.naiveSolution(new int[]{4,5,4,4,4,4,2,3,2,3});
        assertEquals(5,actual);
        actual = oneOddOccurring.naiveSolution(new int[]{4,4,4,4,2,3,2,3});
        assertEquals(-1,actual);
    }

}