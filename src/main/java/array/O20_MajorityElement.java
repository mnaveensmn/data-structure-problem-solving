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

    public int findMajorityUsingMorrisVotingAlgorithm(int[] arr) {
        int n = arr.length;
        int res = 0, count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            }
        }
        if (count > (n / 2)) {
            return res;
        } else {
            return -1;
        }
    }
}
