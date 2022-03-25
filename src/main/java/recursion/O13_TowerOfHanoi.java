package recursion;

public class O13_TowerOfHanoi {

    public void TOH(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println(a + " to " + c);
            return;
        }
        TOH(n - 1, a, c, b);
        System.out.println(a + " to " + c);
        TOH(n - 1, b, a, c);
    }
}
