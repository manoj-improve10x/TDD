package fibonacci.divisiblebyfive;

public class DivisibleByFive {
    public boolean isNumberDivisibleByFive(int n) {
        boolean result = false;
        if(n%5 ==0){
            result = true;
        }
        return result;
    }
}
