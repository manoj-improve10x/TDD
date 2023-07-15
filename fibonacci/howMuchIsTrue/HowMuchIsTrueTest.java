package fibonacci.howMuchIsTrue;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HowMuchIsTrueTest {
    @Test
    public void nothing() {

    }

    @Test
    public void giveEmptyArray() {
        HowMuchIsTrue howMuchIsTrue = new HowMuchIsTrue();
        int result = howMuchIsTrue.howIsMuchTrue(new String[]{" "});
        assertEquals(0,result);
    }
    @Test
    public void giveOneIndex() {
        HowMuchIsTrue howMuchIsTrue = new HowMuchIsTrue();
        int result = howMuchIsTrue.howIsMuchTrue(new String[]{"false"});
        assertEquals(0,result);
    }

    @Test
    public void giveTwoIndex() {
        HowMuchIsTrue howMuchIsTrue = new HowMuchIsTrue();
        int result = howMuchIsTrue.howIsMuchTrue(new String[]{"false","True"});
        assertEquals(1,result);
    }

    @Test
    public void giveTwoIndexes() {
        HowMuchIsTrue howMuchIsTrue = new HowMuchIsTrue();
        int result = howMuchIsTrue.howIsMuchTrue(new String[]{"true","True"});
        assertEquals(2,result);
    }

}
