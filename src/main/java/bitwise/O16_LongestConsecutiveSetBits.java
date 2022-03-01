package bitwise;

public class O16_LongestConsecutiveSetBits {

    public int countLongestConsecutiveSetBits(int n) {
        int count = 0;
        int longestCount = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            } else {
                count = 0;
            }
            if (count > longestCount) {
                longestCount = count;
            }
            n>>=1;
        }
        return longestCount;
    }
}
