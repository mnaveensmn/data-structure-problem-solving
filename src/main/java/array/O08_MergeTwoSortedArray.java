package array;

public class O08_MergeTwoSortedArray {

    public int[] merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] arr3 = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        while (i < m) {
            arr3[k++] = arr1[i++];
        }
        while (j < n) {
            arr3[k++] = arr2[j++];
        }

        return arr3;
    }
}
