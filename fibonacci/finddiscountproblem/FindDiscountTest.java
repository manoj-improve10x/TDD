package fibonacci.finddiscountproblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDiscountTest {

    @Test
    public void givenDiscountZero_returnDiscountZero() {
        FindDiscount discount= new FindDiscount();
        float totalDiscount = discount.findDiscount(0, 0);
        assertEquals(Integer.MIN_VALUE, totalDiscount);
    }

    @Test
    public void givenDiscountMinus10_returnDiscountZero() {
        FindDiscount discount= new FindDiscount();
        float totalDiscount = discount.findDiscount(0, 1);
        assertEquals(Integer.MIN_VALUE, totalDiscount);
    }

    @Test
    public void givenPriceAndDiscount_returnTotalAmount() {
        FindDiscount discount= new FindDiscount();
        float totalDiscount = discount.findDiscount(1, 0);
        assertEquals(1, totalDiscount);
    }

    @Test
    public void givenPriceDiscount_returnTotalDiscountValue1() {
        FindDiscount discount= new FindDiscount();
        float totalDiscount = discount.findDiscount(1, 1);
        assertEquals(1, totalDiscount);
    }

    @Test
    public void givenPriceDiscount_returnTotalDiscountNegativeValue() {
        FindDiscount discount= new FindDiscount();
        float totalDiscount = discount.findDiscount(-1, 0);
        assertEquals(Integer.MIN_VALUE, totalDiscount);
    }

    @Test
    public void givenNegativePriceDiscount_returnTotalDiscount() {
        FindDiscount discount= new FindDiscount();
        float totalDiscount = discount.findDiscount(0, -1);
        assertEquals(Integer.MIN_VALUE, totalDiscount);
    }

    @Test
    public void givenPriceDiscountValues_returnTotalDiscount() {
        FindDiscount discount= new FindDiscount();
        float totalDiscount = discount.findDiscount(100, 75);
        assertEquals(25, totalDiscount);
    }

    @Test
    public void givenPriceDiscountValue_returnTotalDiscount() {
        FindDiscount discount= new FindDiscount();
        float totalDiscount = discount.findDiscount(1000, 75);
        assertEquals(250, totalDiscount);
    }
}

