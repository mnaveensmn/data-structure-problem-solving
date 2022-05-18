package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class O24_CountDistinctWindow {

    //redid - 1
    public int[] countDistinctWindow(int[] arr, int k) {
        ArrayList<Integer> distinctWindowCounts = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        distinctWindowCounts.add(map.size());
        for (int i = k; i < n; i++) {
            if (map.get(arr[i - k]) == 1) {
                map.remove(arr[i - k]);
            } else {
                map.replace(arr[i - k], map.get(arr[i - k]) - 1);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            distinctWindowCounts.add(map.size());
        }
        return distinctWindowCounts.stream().mapToInt(i -> i).toArray();
    }
}
