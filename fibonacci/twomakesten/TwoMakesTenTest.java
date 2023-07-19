package fibonacci.twomakesten;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TwoMakesTenTest {

    @Test
    public void nothing(){

    }

    @Test
    public void giveOneNumber() {
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean result = twoMakesTen.isNumbersTen(10,12);
        assertEquals(true,result);
    }

    @Test
    public void giveSecondNumber() {
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean result = twoMakesTen.isNumbersTen(12,10);
        assertEquals(true,result);
    }

    @Test
    public void giveTwoNumbers() {
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean result = twoMakesTen.isNumbersTen(10,10);
        assertEquals(true,result);
    }

    @Test
    public void giveSecondNumbers() {
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean result = twoMakesTen.isNumbersTen(7,3);
        assertEquals(true,result);
    }
}
