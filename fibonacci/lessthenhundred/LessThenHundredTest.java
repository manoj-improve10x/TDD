package fibonacci.lessthenhundred;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class LessThenHundredTest {

    @Test
    public void nothing() {

    }

    @Test
    public void giveOneLessNumbers() {
        LessThenHundred lessThenHundred = new LessThenHundred();
        boolean result = lessThenHundred.isNumbersAreLessThen(12,13);
        assertEquals(true, result);
    }

    @Test
    public void giveOneLessNumberAndPlusNumber() {
        LessThenHundred lessThenHundred = new LessThenHundred();
        boolean result = lessThenHundred.isNumbersAreLessThen(-12,13);
        assertEquals(true, result);
    }

    @Test
    public void giveOneLessNumberAndPlusNumbers() {
        LessThenHundred lessThenHundred = new LessThenHundred();
        boolean result = lessThenHundred.isNumbersAreLessThen(12,-13);
        assertEquals(true, result);
    }

    @Test
    public void giveOneLessNumberAndHighNumbers() {
        LessThenHundred lessThenHundred = new LessThenHundred();
        boolean result = lessThenHundred.isNumbersAreLessThen(12,130);
        assertEquals(false, result);
    }
}
