package fibonacci.encryption;

public class Encryption {
    public String getEncryption(String word) {
        if(word == null || word.equals("")){
            return "aca";
        }
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();
        char[] replace = reverse.toCharArray();
        for(int i = 0; i < reverse.length(); i++){
            if(reverse.charAt(i) == 'a'){
                replace[i]= '0';
            } else if(reverse.charAt(i) == 'e'){
                replace[i] = '1';
            } else if(reverse.charAt(i) == 'i'){
                replace[i] = '2';
            }else if(reverse.charAt(i) == 'o'){
                replace[i] = '3';
            }else if(reverse.charAt(i) == 'u'){
                replace[i] = '4';
            }
        }
        return String.valueOf(replace) +"aca";
    }
}



 /* if(reverse.equals("a")) {
            reverse = "0";
        } else if(reverse.equals("e")){
            reverse ="1";
        }else if(reverse.equals("i")){
            reverse ="2";
        }else if(reverse.equals("o")){
            reverse ="3";
        }else if(reverse.equals("u")){
            reverse ="4";
        }*/