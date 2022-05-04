package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O19_MaxCircularSubArraySumTest {
    @Test
    public void shouldReturnMaxCircularSubArraySum() {
        O19_MaxCircularSubArraySum maxCircularSubArraySum = new O19_MaxCircularSubArraySum();
        int actual = maxCircularSubArraySum.maxSum(new int[]{10, 5, -5});
        Assertions.assertEquals(15, actual);
        actual = maxCircularSubArraySum.maxSum(new int[]{5, -2, 3, 4});
        Assertions.assertEquals(12, actual);
        actual = maxCircularSubArraySum.maxSum(new int[]{2, 3, -4});
        Assertions.assertEquals(5, actual);
        actual = maxCircularSubArraySum.maxSum(new int[]{8, -4, 3, -5, 4});
        Assertions.assertEquals(12, actual);
    }
}