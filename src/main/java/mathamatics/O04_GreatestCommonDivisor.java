package mathamatics;

public class O04_GreatestCommonDivisor {

    public int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
