package recursion;

import java.util.ArrayList;
import java.util.List;

public class O07_PowerSet {

    public String[] powerSetOfString(String str) {
        List<String> powerSet = new ArrayList<>();
        powerSetOfString(str, 0, "", powerSet);
        return powerSet.toArray(new String[0]);
    }

    //redid - 3
    public void powerSetOfString(String str, int index, String currString, List<String> powerSet) {
        if (str.length() == index) {
            powerSet.add(currString);
            return;
        }
        powerSetOfString(str, index + 1, currString + str.charAt(index), powerSet);
        powerSetOfString(str, index + 1, currString, powerSet);
    }
}
