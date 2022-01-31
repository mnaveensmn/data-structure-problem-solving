package mathamatics;

public class O01_CountDigits {

    public int loopMethod(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public int recursiveMethod(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + recursiveMethod(n / 10);
    }

    //Redid = 1
    public int logMethod(int n) {
        return (int) Math.floor(Math.log10(n))+1;
    }

}
