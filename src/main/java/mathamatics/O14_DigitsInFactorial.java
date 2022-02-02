package mathamatics;

public class O14_DigitsInFactorial {

    //Redid - 1
    public int countDigits(int n) {
       if (n<0) {
           return 0;
       }
       if (n<=1) {
           return 1;
       }
       double digitCount =0;
       for (int i=2;i<=n;i++) {
           digitCount+=Math.log10(i);
       }
       return (int) (Math.floor(digitCount))+1;
    }
}
