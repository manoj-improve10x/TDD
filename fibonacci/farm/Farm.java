package fibonacci.farm;

public class Farm {
    public int countLegs(int chickenLegs, int cowLegs, int pigLegs) {
        int totalLegs = 0;
        if(chickenLegs >= 0 && cowLegs >= 0 && pigLegs >= 0) {
            totalLegs = (chickenLegs * 2) + (cowLegs * 4) + (pigLegs * 4);
        } else {
            totalLegs = -1;
        }
        return totalLegs;
    }
}
