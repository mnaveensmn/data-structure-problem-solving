package array;

public class O03_ArrayRotation {

    public int[] rotateUsingTempArr(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        // i - rotatedArrayIndex
        // j = originalArrayIndex
        int i = 0;
        for (int j = d; j < n; j++) {
            arr[i++] = arr[j];
        }
        // j - tempArrayIndex
        for (int j = 0; j < d; j++) {
            arr[i++] = temp[j];
        }
        return arr;
    }

    public int[] rotateOneAtTime(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        return arr;
    }
}
