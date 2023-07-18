package fibonacci.findBiggestNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindBiggestNumberTest {

    @Test
    public void nothing() {

    }

    @Test
    public void giveEmptyArray() {
        FindBiggestNumber findBiggestNumber = new FindBiggestNumber();
        int result = findBiggestNumber.findBigNumberInArray(new int[]{});
        assertEquals(Integer.MIN_VALUE,result);
    }

    @Test
    public void giveNegativeValues() {
        FindBiggestNumber findBiggestNumber = new FindBiggestNumber();
        int result = findBiggestNumber.findBigNumberInArray(new int[]{-2,-4,-6});
        assertEquals(-2,result);
    }

    @Test
    public void giveOneValues() {
        FindBiggestNumber findBiggestNumber = new FindBiggestNumber();
        int result = findBiggestNumber.findBigNumberInArray(new int[]{-2});
        assertEquals(-2, result);
    }

    @Test
    public void giveOneValue() {
        FindBiggestNumber findBiggestNumber = new FindBiggestNumber();
        int result = findBiggestNumber.findBigNumberInArray(new int[]{2});
        assertEquals(2, result);
    }

    @Test
    public void giveBothValues() {
        FindBiggestNumber findBiggestNumber = new FindBiggestNumber();
        int result = findBiggestNumber.findBigNumberInArray(new int[]{2,-4,8,-99,63});
        assertEquals(63, result);
    }

    @Test
    public void givePositiveValues() {
        FindBiggestNumber findBiggestNumber = new FindBiggestNumber();
        int result = findBiggestNumber.findBigNumberInArray(new int[]{2,4,8,99,63});
        assertEquals(99, result);
    }
}
