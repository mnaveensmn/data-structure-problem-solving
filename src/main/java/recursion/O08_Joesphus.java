package recursion;

public class O08_Joesphus {

    //redid - 1
    public int survivingPosition(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (survivingPosition(n - 1, k) + k - 1) % n + 1;
        }
    }
}
