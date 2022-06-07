package array;

public class O31_FrequencyOfLimArrRangeElement {

    public int[] frequencyOfElements(int[] arr, int n, int p) {
        for (int i = 0; i < n; i++) {
            if (((arr[i] - 1) % (p + 1)) < n) {
                arr[(arr[i] - 1) % (p + 1)] += (p + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= (p + 1);
        }
        return arr;
    }
}
