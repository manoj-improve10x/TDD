package fibonacci;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void nothing() {

    }

    @Test
    public void fibonacciNegative_returnsNegativeNumber() {
        Fibonacci fibonacci = new Fibonacci();
        int num = fibonacci.find(-10);
        assertEquals(-1,num);
    }
}
