package fibonacci.howmuchistrue;

public class HowMuchIsTrue {
    public int howIsMuchTrue(String[] str) {
        int result =0;
        if(str.length ==0){
            return 0;
        } else if (str.length>0){
            for (int i =0; i<str.length;i++) {
                if(str[i].equalsIgnoreCase("true")){
                    result++;
                }
            }
        }
        return result;
    }
}
