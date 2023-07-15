package fibonacci.convertAgeToDays;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ConvertAgeToDaysTest {

    @Test
    public void nothing() {

    }

    @Test
    public void give12_return() {
        ConvertAgeToDays convertAgeToDays = new ConvertAgeToDays();
        int result = convertAgeToDays.personAge(12);
        assertEquals(4380,result);
    }

    @Test
    public void give1_return() {
        ConvertAgeToDays convertAgeToDays = new ConvertAgeToDays();
        int result = convertAgeToDays.personAge(1);
        assertEquals(365,result);
    }

    @Test
    public void giveNegative_return0() {
        ConvertAgeToDays convertAgeToDays = new ConvertAgeToDays();
        int result = convertAgeToDays.personAge(-12);
        assertEquals(0,result);
    }
}
