package array;

public class O14_FrequencyOfSortedArray {

    public void frequencyOfSortedArray(int[] arr) {
        int n = arr.length;
        int freq = 1, i = 1;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                i++;
                freq++;
            }
            System.out.println(arr[i - 1] + " ==> " + freq);
            i++;
            freq = 1;
        }
        if (n == 1 || arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1] + " ==> " + 1);
        }
    }
}
