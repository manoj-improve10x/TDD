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

    @Test
    public void fibonacciZero_returnsNumberZero() {
        Fibonacci fibonacci = new Fibonacci();
        int n = fibonacci.find(0);
        assertEquals(0,n);
    }

    @Test
    public void fibonacciOne_returnOne() {
        Fibonacci fibonacci = new Fibonacci();
        int num = fibonacci.find(1);
        assertEquals(1,num);
    }

    //0,1,1,2,3,5,8,13,21
    @Test
    public void fibonacciTwo_returnOne() {
        Fibonacci fibonacci = new Fibonacci();
        int n = fibonacci.find(4);
        assertEquals(3,n);
    }
}
