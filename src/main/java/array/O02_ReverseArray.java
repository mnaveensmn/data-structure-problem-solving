package array;

public class O02_ReverseArray {

    public char[] reverse(char[] array) {
        for (int arrIndex = 0; arrIndex < array.length / 2; arrIndex++) {
            int end = array.length - 1 - arrIndex;
            swap(array, arrIndex, end);
        }
        return array;
    }

    private void swap(char[] array, int leftIndex, int rightIndex) {
        char temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }
}
