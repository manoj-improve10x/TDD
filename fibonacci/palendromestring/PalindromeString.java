package fibonacci.palendromestring;

public class PalindromeString {
    public boolean findPalindrome(String name) {
        boolean result = false;
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();

        if(name == null) {
            result = false;
        } else if (name == ""){
            result = true;
        }else if(name == " "){
            result = true;
        }else if(name.equalsIgnoreCase(reverse)) {
            result= true;
        }
        return result;
    }
}
