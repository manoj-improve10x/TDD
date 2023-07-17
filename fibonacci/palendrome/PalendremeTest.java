package fibonacci.palendrome;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PalendremeTest {

    @Test
    public void nothing() {

    }
    @Test
    public void givenZero() {
        Palendrome palendrome = new Palendrome();
        boolean number = palendrome.isNumber(0);
        assertEquals(true,number);
    }
    @Test
    public void givenTwoNumbers() {
        Palendrome palendrome = new Palendrome();
        boolean number = palendrome.isNumber(121);
        assertEquals(true,number);
    }

    @Test
    public void givenTwoNumbers_return() {
        Palendrome palendrome = new Palendrome();
        boolean number = palendrome.isNumber(120);
        assertEquals(false,number);
    }
}
