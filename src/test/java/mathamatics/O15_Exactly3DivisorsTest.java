package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class O15_Exactly3DivisorsTest {

    @Test
    public void shouldReturnArrayOf3DivisorNumberForGivenRange() {

        O15_Exactly3Divisors exactly3Divisors = new O15_Exactly3Divisors();
        int[] actualThreeDivisors = exactly3Divisors.threeDivisors(16);
        assertArrayEquals(new int[]{4, 9}, actualThreeDivisors);
        actualThreeDivisors = exactly3Divisors.threeDivisors(49);
        assertArrayEquals(new int[]{4, 9,25,49}, actualThreeDivisors);
        actualThreeDivisors = exactly3Divisors.threeDivisors(0);
        assertArrayEquals(new int[]{}, actualThreeDivisors);
        actualThreeDivisors = exactly3Divisors.threeDivisors(1);
        assertArrayEquals(new int[]{}, actualThreeDivisors);
    }

}