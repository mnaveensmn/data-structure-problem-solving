package mathamatics;

public class O09_PalindromeNumber {

    //Redid - 3
    public boolean isPalindrome(int n) {
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int res = n % 10;
            sum = (sum * 10) + res;
            n = n / 10;
        }
        return temp == sum;
    }
}
