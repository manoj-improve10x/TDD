package fibonacci.countvowels;

public class CountVowels {
    public int howManyVowels(String word) {
        int result = 0;
        if (word == null || word.isEmpty()){
            return result;
        }
        else if (word.equals("a")){
            result = 1;
        } else if(word.equals("e")){
            result = 1;
        } else if(word.equals("i")){
            result = 1;
        } else if(word.equals("o")){
            result = 1;
        } else if(word.equals("u")){
            result = 1;
        }else if(word.length()>1){
            for (int i = 0; i<word.length();i++){
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) =='i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                    result++;
                }
            }
        }
        return result;
    }
}
/*
 else if (word.equals("a")){
            result = 1;
        } else if(word.equals("e")){
            result = 1;
        } else if(word.equals("i")){
            result = 1;
        } else if(word.equals("o")){
            result = 1;
        } else if(word.equals("u")){
            result = 1;
        } else {

        }
 */
