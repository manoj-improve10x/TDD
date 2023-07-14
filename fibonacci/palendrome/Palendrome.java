package fibonacci.palendrome;

public class Palendrome {
    public boolean isNumber(int number) {
        int reverse = number;
        int sum =0;
        while (number > 0) {
            reverse = number % 10;
            sum = (sum * 10) + reverse;
            number = number / 10;
            }
        if (reverse == number) {
            return true;
        }
        return false;
    }
}
