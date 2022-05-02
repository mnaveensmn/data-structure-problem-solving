package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O16_TrappingRainWaterTest {

    @Test
    public void returnCapacityOfRainWater() {
        O16_TrappingRainWater trappingRainWater = new O16_TrappingRainWater();
        int capacity = trappingRainWater.rainWaterCapacityUsingNaiveSolution(new int[]{3, 0, 1, 2, 5});
        Assertions.assertEquals(6, capacity);
        capacity = trappingRainWater.rainWaterCapacityUsingNaiveSolution(new int[]{2, 0, 2});
        Assertions.assertEquals(2, capacity);
        capacity = trappingRainWater.rainWaterCapacityUsingNaiveSolution(new int[]{2, 1, 1, 0, 3});
        Assertions.assertEquals(4, capacity);
    }

}