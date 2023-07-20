package fibonacci.existhighernumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExistHigherNumberTest {
        private ExistHigherNumber higher;

        @BeforeEach
        public void setup(){
            higher = new ExistHigherNumber();
        }

        @Test
        public void nothing(){

        }

        @Test
        public void givenEmptyArrayWith0_returnFalse() {
            boolean result = higher.existsHigher(new int[]{}, 0);
            assertEquals(false, result);
        }

        @Test
        public void givenNegativeArrayWith0_returnsTrue() {
            boolean result = higher.existsHigher(new int[]{-11, -12}, 0);
            assertEquals(false, result);
        }

        @Test
        public void givenNegativeAndPositiveArrayWith0_returnsTrue() {
            boolean result = higher.existsHigher(new int[]{21, -32}, 0);
            assertEquals(true, result);
        }

        @Test
        public void givenNumbers_returnTrue() {
            boolean result = higher.existsHigher(new int[]{5, 16, 15, 22, 4}, 10);
            assertEquals(true, result);
        }

        @Test
        public void givenNumbersWithFour_returnTrue() {
            boolean result = higher.existsHigher(new int[]{1, 2, 3, 6, 5}, 8);
            assertEquals(false, result);
        }

        @Test
        public void givenNumbersWithOneEqual_returnTrue() {
            boolean result = higher.existsHigher(new int[]{4, 3, 4, 3, 2, 2, 2}, 4);
            assertEquals(true, result);
}

}
