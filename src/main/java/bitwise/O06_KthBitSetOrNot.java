package bitwise;

public class O06_KthBitSetOrNot {

    public boolean isBitSet(int n, int position) {
        int leftShifted = (1<<position);
        return (n & leftShifted)==leftShifted;
    }
}
