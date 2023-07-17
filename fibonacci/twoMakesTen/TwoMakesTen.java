package fibonacci.twoMakesTen;

public class TwoMakesTen {
    public boolean isNumbersTen(int a, int b) {
        if(a == 10 || b ==10){
            return true;
        } else if(a+b == 10){
            return true;
        }
        return false;
    }
}
