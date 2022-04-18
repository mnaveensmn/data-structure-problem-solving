package array;

public class O06_EquilibriumIndex {

    public int eqIndex(int[] arr) {
        int sum = 0, leftSum = 0;
        for (int i : arr) {
            sum += i;
        }
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            if (leftSum == sum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
