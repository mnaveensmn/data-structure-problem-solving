package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O05_PrefixSumProblemsTest {

    @Test
    public void shouldReturnThePrefixSumOfGivenArray() {
        O05_PrefixSumProblems prefixSumProblems = new O05_PrefixSumProblems();
        int[] actual = prefixSumProblems.prefixSum(new int[]{1, 2, 3, 4, 5});
        Assertions.assertArrayEquals(new int[]{1, 3, 6, 10, 15}, actual);
        actual = prefixSumProblems.prefixSum(new int[]{500, 200, 50});
        Assertions.assertArrayEquals(new int[]{500, 700, 750}, actual);
    }

    @Test
    public void shouldReturnSumOfGivenRangeInArray() {
        O05_PrefixSumProblems prefixSumProblems = new O05_PrefixSumProblems();
        int actual = prefixSumProblems.sumInRange(new int[]{1, 2, 3, 4, 5}, 0, 3);
        Assertions.assertEquals(7, actual);
        actual = prefixSumProblems.sumInRange(new int[]{500, 200, 50},1,2);
        Assertions.assertEquals(250, actual);
    }

}