package array;

public class O06_EquilibriumIndex {

    //redid - 1
    public int eqIndex(int[] arr) {
        int sum = 0,
                leftSum = 0,
                n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (leftSum == sum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
