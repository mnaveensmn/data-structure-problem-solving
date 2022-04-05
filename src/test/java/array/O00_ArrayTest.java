package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O00_ArrayTest {

    public O00_Array array;

    public O00_ArrayTest() {
        createArrayForTest();
    }

    private void createArrayForTest() {
        array = new O00_Array(10);
    }

    @Test
    public void shouldInitiateArrayWithSize() {
        Assertions.assertNotNull(array);
        Assertions.assertEquals(10, array.size);
        Assertions.assertEquals(0, array.length);
        int[] expectedArray = new int[10];
        Assertions.assertArrayEquals(expectedArray, array.array);
    }


}