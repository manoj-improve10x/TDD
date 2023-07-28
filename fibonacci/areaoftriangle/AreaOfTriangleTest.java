package fibonacci.areaoftriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfTriangleTest {

        @Test
        public void nothing() {

        }

        @Test
        public void givenMinus1AndMinus3_returnIntegerMinValue() {
            AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
            int resultMinusValue = areaOfTriangle.convert(-1, -3);
            assertEquals(Integer.MIN_VALUE, resultMinusValue);
        }

        @Test
        public void givenMinus1AndMinus0_returnIntegerMinValue() {
            AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
            int resultMinusValue = areaOfTriangle.convert(-1, 0);
            assertEquals(Integer.MIN_VALUE, resultMinusValue);
        }

        @Test
        public void givenZeroAndMinus2_returnIntegerMinValue() {
            AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
            int resultMinusValue = areaOfTriangle.convert(0, -2);
            assertEquals(Integer.MIN_VALUE, resultMinusValue);
        }

        @Test
        public void givenZeros_returnZero() {
            AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
            int resultZero = areaOfTriangle.convert(0, 0);
            assertEquals(0, resultZero);
        }

        @Test
        public void givenZeroAndTwo_returnZero() {
            AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
            int resultZero = areaOfTriangle.convert(0, 2);
            assertEquals(0, resultZero);
        }

        @Test
        public void givenFourAndZero_returnZero() {
            AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
            int resultZero = areaOfTriangle.convert(4, 0);
            assertEquals(0, resultZero);
        }

        @Test
        public void givenThreeAndTwo_returnThree() {
            AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
            int positiveValue = areaOfTriangle.convert(3, 2);
            assertEquals(3, positiveValue);
        }

        @Test
        public void givenSevenAndFour_returnFourteen() {
            AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
            int value = areaOfTriangle.convert(7, 4);
            assertEquals(14, value);
        }

        @Test
        public void givenTenAndTen_returnFifty() {
            AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
            int value = areaOfTriangle.convert(10, 10);
            assertEquals(50, value);
    }
}
