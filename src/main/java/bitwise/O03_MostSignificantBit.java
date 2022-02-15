package bitwise;

public class O03_MostSignificantBit {
    public int msb(int n) {
        //log base 2
        int msb = (int) Math.floor(Math.log(n) / Math.log(2));
        return (int) Math.pow(2, msb);
    }
}
