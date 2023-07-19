package fibonacci.scoringsystem;

public class Scoring {
    public int[] calculateScores(Object numbers) {
        if(numbers != null && numbers.equals("A")) {
            return new int[] {1,0,0};
        } else if(numbers != null && numbers.equals("B")) {
            return new int [] {0,1,0};
        }
        return new int[3];
    }
}
