package array;

import java.util.ArrayList;

public class O12_LeadersInArray {

    public int[] leadersInArray(int[] arr) {
        int n = arr.length;
        int currLeader = arr[n - 1];
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(currLeader);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > currLeader) {
                leaders.add(arr[i]);
            }
        }
        return leaders.stream().mapToInt(i -> i).toArray();
    }
}
