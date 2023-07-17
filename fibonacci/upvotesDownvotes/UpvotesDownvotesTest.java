package fibonacci.upvotesDownvotes;

import fibonacci.lessThenHundred.LessThenHundred;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UpvotesDownvotesTest {

    @Test
    public void nothing() {

    }

    @Test
    public void giveOneLessNumber() {
        UpvotesDownvotes upvotesDownvotes = new UpvotesDownvotes();
        int result = upvotesDownvotes.findVotes(12,13);
        assertEquals(-1, result);
    }

    @Test
    public void giveLessNumber() {
        UpvotesDownvotes upvotesDownvotes = new UpvotesDownvotes();
        int result = upvotesDownvotes.findVotes(-12,-13);
        assertEquals(1, result);
    }

    @Test
    public void givePositiveNumbers() {
        UpvotesDownvotes upvotesDownvotes = new UpvotesDownvotes();
        int result = upvotesDownvotes.findVotes(55,10);
        assertEquals(45, result);
    }
}
