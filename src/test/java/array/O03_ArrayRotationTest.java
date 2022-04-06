package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O03_ArrayRotationTest {

    @Test
    public void shouldRotateArrayUsingTempArrayMethod() {
        O03_ArrayRotation arrayRotation = new O03_ArrayRotation();
        int[] actualArray = arrayRotation.rotateUsingTempArr(new int[]{1, 2, 3, 4, 5}, 3);
        Assertions.assertArrayEquals(new int[]{4, 5, 1, 2, 3}, actualArray);
        actualArray = arrayRotation.rotateUsingTempArr(new int[]{1, 2, 3, 4, 5, 6}, 1);
        Assertions.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 1}, actualArray);
        actualArray = arrayRotation.rotateUsingTempArr(new int[]{1, 2, 3, 4, 5, 6}, 6);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actualArray);
        actualArray = arrayRotation.rotateUsingTempArr(new int[]{1, 2, 3, 4, 5, 6}, 0);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actualArray);
        actualArray = arrayRotation.rotateUsingTempArr(new int[]{1, 2, 3, 4, 5, 6}, 4);
        Assertions.assertArrayEquals(new int[]{5, 6, 1, 2, 3, 4}, actualArray);
    }

    @Test
    public void shouldRotateArrayUsingOneByOneMethod() {
        O03_ArrayRotation arrayRotation = new O03_ArrayRotation();
        int[] actualArray = arrayRotation.rotateOneAtTime(new int[]{1, 2, 3, 4, 5}, 3);
        Assertions.assertArrayEquals(new int[]{4, 5, 1, 2, 3}, actualArray);
        actualArray = arrayRotation.rotateOneAtTime(new int[]{1, 2, 3, 4, 5, 6}, 1);
        Assertions.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 1}, actualArray);
        actualArray = arrayRotation.rotateOneAtTime(new int[]{1, 2, 3, 4, 5, 6}, 6);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actualArray);
        actualArray = arrayRotation.rotateOneAtTime(new int[]{1, 2, 3, 4, 5, 6}, 0);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actualArray);
        actualArray = arrayRotation.rotateOneAtTime(new int[]{1, 2, 3, 4, 5, 6}, 4);
        Assertions.assertArrayEquals(new int[]{5, 6, 1, 2, 3, 4}, actualArray);
    }

}