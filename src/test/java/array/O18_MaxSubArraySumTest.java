package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O18_MaxSubArraySumTest {

    @Test
    public void shouldReturnMaxSubArraySum() {
        O18_MaxSubArraySum maxSubArraySum = new O18_MaxSubArraySum();
        int actual = maxSubArraySum.maxSubArraySumUsingNaiveSolution(new int[]{2, 3, -8, 7, -1, 2, 3});
        Assertions.assertEquals(11, actual);
        actual = maxSubArraySum.maxSubArraySumUsingNaiveSolution(new int[]{5, 8, 3});
        Assertions.assertEquals(16, actual);
        actual = maxSubArraySum.maxSubArraySumUsingNaiveSolution(new int[]{1, 1, 3, -5, 3, -2, 2, 1});
        Assertions.assertEquals(5, actual);
    }

}