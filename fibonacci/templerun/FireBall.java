package fibonacci.templerun;

public class FireBall {

        private int points;
        public FireBall(int speed) {
            this.points = speed;
            if(speed < 0 || speed > 100) {
                throw new InvalidFireBallSpeedException();
            }
        }

        public void roll() {
            System.out.println("FireBall is rolled with " + points + " kmh speed!");

        }

        public class InvalidFireBallSpeedException extends RuntimeException{

        }
}
