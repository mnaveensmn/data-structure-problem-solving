package bitwise;

import java.util.ArrayList;
import java.util.List;

public class O11_PowerSet {

    public String[] powerSetOfString(String str) {
        List<String> result = new ArrayList<>();
        int n = str.length();
        int powSize = (int) Math.pow(2, n);
        for (int counter = 0; counter < powSize; counter++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((counter & (1 << j)) != 0) {
                    stringBuilder.append(str.charAt(j));
                }
            }
            result.add(stringBuilder.toString());
        }
        System.out.println(result);
        return result.toArray(new String[0]);
    }
}
