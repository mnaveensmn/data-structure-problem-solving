package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O14_FrequencyOfSortedArrayTest {

    @Test
    public void shouldPrintFrequencyOfSortedArray() {
        O14_FrequencyOfSortedArray frequencyOfSortedArray = new O14_FrequencyOfSortedArray();
        frequencyOfSortedArray.frequencyOfSortedArray(new int[]{1, 1, 1, 2, 2, 3, 3});
        frequencyOfSortedArray.frequencyOfSortedArray(new int[]{1, 1, 2, 3});
        frequencyOfSortedArray.frequencyOfSortedArray(new int[]{1});
    }

    @Test
    public void shouldPrintFrequencyOfUnsortedArrayUsingNegativeMethod() {
        O14_FrequencyOfSortedArray frequencyOfSortedArray = new O14_FrequencyOfSortedArray();
        int[] actual = frequencyOfSortedArray.frequencyOfUnSortedArrayUsingNegativeApproach(new int[]{1, 1, 1, 2, 2, 3, 3});
        Assertions.assertArrayEquals(new int[]{-3, -2, -2, 0, 0, 0, 0}, actual);
        actual = frequencyOfSortedArray.frequencyOfUnSortedArrayUsingNegativeApproach(new int[]{1, 1, 2, 3});
        Assertions.assertArrayEquals(new int[]{-2, -1, -1, 0}, actual);
        frequencyOfSortedArray.frequencyOfUnSortedArrayUsingNegativeApproach(new int[]{1});
    }

}