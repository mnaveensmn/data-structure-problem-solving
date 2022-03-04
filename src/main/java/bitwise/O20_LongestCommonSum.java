package bitwise;

public class O20_LongestCommonSum {

    public int naiveSolution(int[] aArr, int[] bArr) {
        int maxLen = 0;
        for (int i = 0; i < aArr.length; i++) {
            int aSum = 0, bSum = 0;
            for (int j = i; j < bArr.length; j++) {
                aSum += aArr[j];
                bSum += bArr[j];
                if (aSum == bSum) {
                    int len = (j > i) ? j - i + 1 : 0;
                    if (len > maxLen) {
                        maxLen = len;
                    }
                }
            }
        }
        return maxLen;
    }
}
