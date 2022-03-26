package recursion;

public class O13_TowerOfHanoi {

    //redid - 1
    public void TOH(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println(a + " to " + c);
            return;
        }
        TOH(n, a, c, b);
        System.out.println(a + " to " + c);
        TOH(n, b, a, c);
    }
}
