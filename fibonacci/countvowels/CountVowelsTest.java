package fibonacci.countvowels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountVowelsTest {

    @Test
    public void nothing() {

    }

    @Test
    public void giveNull_returns0(){
        CountVowels countVowels = new CountVowels();
        int result = countVowels.howManyVowels(null);
        assertEquals(0,result);
    }

    @Test
    public void giveEmpty_returns0(){
        CountVowels countVowels = new CountVowels();
        int result = countVowels.howManyVowels("");
        assertEquals(0,result);
    }
    @Test
    public void givea_returns1(){
        CountVowels countVowels = new CountVowels();
        int result = countVowels.howManyVowels("a");
        assertEquals(1,result);
    }

    @Test
    public void givee_returns1(){
        CountVowels countVowels = new CountVowels();
        int result = countVowels.howManyVowels("e");
        assertEquals(1,result);
    }
    @Test
    public void givei_returns1(){
        CountVowels countVowels = new CountVowels();
        int result = countVowels.howManyVowels("i");
        assertEquals(1,result);
    }
    @Test
    public void giveo_returns1(){
        CountVowels countVowels = new CountVowels();
        int result = countVowels.howManyVowels("o");
        assertEquals(1,result);
    }
    @Test
    public void giveu_returns1(){
        CountVowels countVowels = new CountVowels();
        int result = countVowels.howManyVowels("u");
        assertEquals(1,result);
    }
    @Test
    public void givebc_returns0(){
        CountVowels countVowels = new CountVowels();
        int result = countVowels.howManyVowels("bc");
        assertEquals(0,result);
    }
    @Test
    public void givejk_returns0(){
        CountVowels countVowels = new CountVowels();
        int result = countVowels.howManyVowels("jk");
        assertEquals(0,result);
    }

    @Test
    public void giveab_returns1(){
        CountVowels countVowels = new CountVowels();
        int result = countVowels.howManyVowels("ab");
        assertEquals(1,result);
    }
    @Test
    public void giveabe_returns1(){
        CountVowels countVowels = new CountVowels();
        int result = countVowels.howManyVowels("abe");
        assertEquals(2,result);
    }
    @Test
    public void giveabei_returns3(){
        CountVowels countVowels = new CountVowels();
        int result = countVowels.howManyVowels("abei");
        assertEquals(3,result);
    }
}
