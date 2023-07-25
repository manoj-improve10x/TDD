package fibonacci.encryption;

public class Encryption {
    public String getEncryption(String word) {
        if(word == null || word.equals("")){
            return "aca";
        }
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();

        if(reverse.equals("a")) {
            reverse = "0";
        } else if(reverse.equals("e")){
            reverse ="1";
        }else if(reverse.equals("i")){
            reverse ="2";
        }else if(reverse.equals("o")){
            reverse ="3";
        }else if(reverse.equals("u")){
            reverse ="4";
        }
        return reverse +"aca";
    }
}
