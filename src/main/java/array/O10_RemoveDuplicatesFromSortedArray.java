package array;

public class O10_RemoveDuplicatesFromSortedArray {

    public int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int tempArrLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (temp[tempArrLen - 1] != arr[i]) {
                temp[tempArrLen] = arr[i];
                tempArrLen++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < tempArrLen) {
                arr[i] = temp[i];
            } else {
                arr[i] = 0;
            }
        }

        return arr;
    }
}
