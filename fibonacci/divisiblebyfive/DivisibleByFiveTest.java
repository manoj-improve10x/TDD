package fibonacci.divisiblebyfive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleByFiveTest {

    @Test
    public void nothing() {

    }

    @Test
    public void giveNumber0_returnFalse() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        boolean result = divisibleByFive.isNumberDivisibleByFive(0);
        assertEquals(0,result);
    }
}
