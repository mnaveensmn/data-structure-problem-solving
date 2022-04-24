package array;

import org.junit.jupiter.api.Test;

class O14_FrequencyOfSortedArrayTest {

    @Test
    public void shouldPrintFrequencyOfSortedArray() {
        O14_FrequencyOfSortedArray frequencyOfSortedArray = new O14_FrequencyOfSortedArray();
        frequencyOfSortedArray.frequencyOfSortedArray(new int[]{1, 1, 1, 2, 2, 3, 3});
        frequencyOfSortedArray.frequencyOfSortedArray(new int[]{1, 1, 2, 3});
        frequencyOfSortedArray.frequencyOfSortedArray(new int[]{1});
    }
}