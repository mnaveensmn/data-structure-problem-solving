package array;

public class O11_MoveZerosEnd {

    //redid - 3
    public void moveZeros(int[] arr) {
        int n = arr.length;
        int lastNonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[lastNonZeroIndex];
                arr[lastNonZeroIndex] = arr[i];
                arr[i] = temp;
                lastNonZeroIndex++;
            }
        }
    }
}
