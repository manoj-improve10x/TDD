package fibonacci.convertagetodays;

public class ConvertAgeToDays {
    public int personAge(int age) {
        if(age<0){
            return 0;
        } else {
            int days = 0;
            days = 365*age;
            return days;
        }
    }
}
