package mathamatics;

public class O09_PalindromeNumber {

    public boolean isPalindrome(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        return sum == temp;
    }
}
