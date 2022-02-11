package bitwise;

public class O01_BitTactics {

    public int setBit(int n, int position) {
        //Step 1: Left shift 1 to given position
        int leftShifted = 1 << position;
        //Step 2: Perform OR operation on leftShifted and n
        return n | leftShifted;
    }

    public int unSetBit(int n, int position) {
        //Step 1: Left shift 1 to given position
        int leftShifted = 1 << position;
        //Step 2: Flip the bits of left shifted number
        int flipped = ~leftShifted;
        //Step 3: Perform AND operation on 'flipped' and 'n'
        return n & flipped;

    }
}
