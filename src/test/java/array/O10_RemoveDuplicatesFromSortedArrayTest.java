package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O10_RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void shouldRemoveDuplicatesFromSortedArray() {
        O10_RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new O10_RemoveDuplicatesFromSortedArray();
        int[] actual = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 1, 2, 3, 3, 4, 4, 4});
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 0, 0, 0, 0, 0}, actual);
    }

}