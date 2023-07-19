package fibonacci.stringendingsecondmatches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringEndingWithSecondStringTest {
    @Test
    public void nothing() {

    }
    @Test
    public void giveTwoNullValues() {
        StringEndingWithSecondString stringEndingWithSecondString = new StringEndingWithSecondString();
        boolean result = stringEndingWithSecondString.isEndsWithSecond(null, null);
        assertEquals(true,result);
    }
    @Test
    public void giveOneNullValue() {
        StringEndingWithSecondString stringEndingWithSecondString = new StringEndingWithSecondString();
        boolean result = stringEndingWithSecondString.isEndsWithSecond("", null);
        assertEquals(false,result);
    }
    @Test
    public void giveFirstNullValue() {
        StringEndingWithSecondString stringEndingWithSecondString = new StringEndingWithSecondString();
        boolean result = stringEndingWithSecondString.isEndsWithSecond(null, "");
        assertEquals(false,result);
    }
    @Test
    public void giveTwoValues() {
        StringEndingWithSecondString stringEndingWithSecondString = new StringEndingWithSecondString();
        boolean result = stringEndingWithSecondString.isEndsWithSecond("abc","c");
        assertEquals(true,result);
    }
    @Test
    public void giveTwoValueS_KSensitive() {
        StringEndingWithSecondString stringEndingWithSecondString = new StringEndingWithSecondString();
        boolean result = stringEndingWithSecondString.isEndsWithSecond("manoj","j");
        assertEquals(true,result);
    }
    @Test
    public void giveTwoEmptyValues() {
        StringEndingWithSecondString stringEndingWithSecondString = new StringEndingWithSecondString();
        boolean result = stringEndingWithSecondString.isEndsWithSecond(" ", "");
        assertEquals(false,result);
    }
}
