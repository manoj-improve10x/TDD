package fibonacci.palendromestring;

import fibonacci.palendrome.PalindromeTest;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeStringTest {

    PalindromeString palindromeString;

    @Test
    public void nothing() {

    }

    @BeforeEach
    public void setPalindromeString() {
        palindromeString = new PalindromeString();
    }

    @Test
    public void giveNull_returnFalse() {
        boolean result = palindromeString.findPalindrome("Name");
        assertEquals(false,result);
    }
    @Test
    public void giveEmpty_returnTrue() {
        boolean result = palindromeString.findPalindrome("");
        assertEquals(true,result);
    }
    @Test
    public void giveSingleOne_returnTrue() {
        boolean result = palindromeString.findPalindrome("N");
        assertEquals(true,result);
    }
    @Test
    public void giveGiveTwoDifferent_returnFalse() {
        boolean result = palindromeString.findPalindrome("Na");
        assertEquals(false,result);
    }
    @Test
    public void giveTwoSame_returnTrue() {
        boolean result = palindromeString.findPalindrome("aa");
        assertEquals(true,result);
    }
}
