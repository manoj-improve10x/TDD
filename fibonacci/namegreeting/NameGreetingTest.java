package fibonacci.namegreeting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameGreetingTest {

    @Test
    public void nothing() {

    }

    @Test
    public void giveEmpty() {
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.displayGreetingName("");
        assertEquals("Hello !",name);
    }

    @Test
    public void giveSpaceEmpty() {
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.displayGreetingName(" ");
        assertEquals("Hello  !",name);
    }
    @Test
    public void giveName() {
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.displayGreetingName("Manoj");
        assertEquals("Hello Manoj!",name);
    }
    @Test
    public void giveNameAndSpace() {
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.displayGreetingName("Manoj ");
        assertEquals("Hello Manoj !",name);
    }
    @Test
    public void giveSpaceBeforeName() {
        NameGreeting nameGreeting = new NameGreeting();
        String name = nameGreeting.displayGreetingName(" Manu");
        assertEquals("Hello  Manu!",name);
    }
}
