package fibonacci.farm;


import fibonacci.existhighernumber.ExistHigherNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmTest {

    private Farm farm;

    @BeforeEach
    public void setup(){
        farm = new Farm();
    }

    @Test
    public void nothing(){

    }

    @Test
    public void giveAllNegative() {
        int result = farm.countLegs(-1,-2,-3);
        assertEquals(-1, result);
    }
    @Test
    public void giveLastTwoNegative() {
        int result = farm.countLegs(0,-2,-3);
        assertEquals(-1, result);
    }
    @Test
    public void giveMiddlePositive() {
        int result = farm.countLegs(-1,0,-3);
        assertEquals(-1, result);
    }
    @Test
    public void giveFirstTwoNegative() {
        int result = farm.countLegs(-1,-2,0);
        assertEquals(-1, result);
    }
    @Test
    public void giveAllZeros() {
        int result = farm.countLegs(0,0,0);
        assertEquals(0, result);
    }
    @Test
    public void giveOnePositive() {
        int result = farm.countLegs(1,0,0);
        assertEquals(2, result);
    }
    @Test
    public void giveTwoPositive() {
        int result = farm.countLegs(1,2,0);
        assertEquals(10, result);
    }
    @Test
    public void giveLastTwoPositive() {
        int result = farm.countLegs(0,2,2);
        assertEquals(16, result);
    }
    @Test
    public void giveAllPositive() {
        int result = farm.countLegs(1,2,2);
        assertEquals(18, result);
    }
}
