package fibonacci.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void nothing() {

    }

   /* 0 <=0 -> -1
      1 -> 1 = 1
      2 -> 1*2 = 2
      5 -> 1*2*3*4*5 = 120*/

    @Test
    public void givenLessOrEqualToZero_returnsNegativeNumber(){
        Factorial factorial = new Factorial();
        int value = factorial.findFactorial(-10);
        assertEquals(-1,value);
    }

    @Test
    public void givenNumberOne_returnsOne(){
        Factorial factorial = new Factorial();
        int value = factorial.findFactorial(-1);
        assertEquals(-1,value);
    }

    @Test
    public void givenNumberTwo_returnsTwo(){
        Factorial factorial = new Factorial();
        int value = factorial.findFactorial(0);
        assertEquals(1,value);
    }

    @Test
    public void givenNumberFive_returns120(){
        Factorial factorial = new Factorial();
        int value = factorial.findFactorial(5);
        assertEquals(120,value);
    }
}