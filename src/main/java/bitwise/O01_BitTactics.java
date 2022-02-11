package bitwise;

public class O01_BitTactics {

    public int setBit(int n, int position) {
        //Step 1: Left shift 1 to given position
        int leftShifted = 1 << position;
        //Step 2: Perform OR operation on leftShifted and n
        return n | leftShifted;
    }
}
