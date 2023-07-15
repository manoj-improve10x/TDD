package fibonacci.palendrome;

public class Palendrome {
    public boolean isNumber(int number) {
        int reverse = number;
        while (number > 0) {
            int sum =1;
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
