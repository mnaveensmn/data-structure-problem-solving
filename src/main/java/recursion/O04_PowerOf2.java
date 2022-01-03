package recursion;

public class O04_PowerOf2 {

    public int powerOf2(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int prev = powerOf2(n / 2);
        int curr = prev * 2;
        System.out.println(curr);
        return curr;
    }
}
