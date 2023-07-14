package fibonacci.palendrome;

import org.junit.jupiter.api.Test;

public class PalendremeTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenZero() {
        Palendrome palendrome = new Palendrome();
        boolean number = palendrome.isNumber(0);
    }
}
