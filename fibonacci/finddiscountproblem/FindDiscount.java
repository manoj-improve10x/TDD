package fibonacci.finddiscountproblem;

public class FindDiscount {

    public float findDiscount(float price, int discount) {
        float discountAmount = 0;
        float finalPrice = 0;
        if (price > 0) {
            discountAmount = price * discount / 100;
            finalPrice = price - discountAmount;
            return finalPrice;
        } else {
            return Integer.MIN_VALUE;
        }
    }
}
