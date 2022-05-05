package array;

public class O20_MajorityElement {

    public int findMajorityUsingNaiveSolution(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > (n / 2)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
