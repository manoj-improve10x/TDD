package fibonacci.squeresAndCubes;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SquaresAndCubesTest {

    @Test
    public void nothing() {

    }

    @Test
    public void giveEmptyArray() {
        SquareAndCubes squareAndCubes = new SquareAndCubes();
        boolean result = squareAndCubes.arr(new int[]{});
        assertEquals(false,result);
    }

    @Test
    public void giveSingleIndex_returnFalse() {
        SquareAndCubes squareAndCubes = new SquareAndCubes();
        boolean result = squareAndCubes.arr(new int[]{2});
        assertEquals(false,result);
    }
}
