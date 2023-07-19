package fibonacci.divisiblebyfive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleByFiveTest {

    @Test
    public void nothing() {

    }

    @Test
    public void giveNumber0_returnTrue() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        boolean result = divisibleByFive.isNumberDivisibleByFive(0);
        assertEquals(true,result);
    }
    @Test
    public void giveNumber5_returnTrue() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        boolean result = divisibleByFive.isNumberDivisibleByFive(5);
        assertEquals(true,result);
    }
    @Test
    public void giveNumber3_returnFalse() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        boolean result = divisibleByFive.isNumberDivisibleByFive(3);
        assertEquals(false,result);
    }
    @Test
    public void giveNumberNegative5_returnFalse() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        boolean result = divisibleByFive.isNumberDivisibleByFive(-5);
        assertEquals(true,result);
    }
    @Test
    public void giveNumberNegative6_returnFalse() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        boolean result = divisibleByFive.isNumberDivisibleByFive(-6);
        assertEquals(false,result);
    }

}
