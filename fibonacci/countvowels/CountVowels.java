package fibonacci.countvowels;

public class CountVowels {
    public int howManyVowels(String word) {
        int result = 0;
        if (word == null){
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
        }
        return result;
    }
}
