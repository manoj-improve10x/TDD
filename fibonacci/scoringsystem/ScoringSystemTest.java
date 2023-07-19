package fibonacci.scoringsystem;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class ScoringSystemTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnsAllZeros() {
        Scoring scoring = new Scoring();
        int [] allZeros = scoring.calculateScores(null);
        assertArrayEquals(new int[3],allZeros);
    }

    @Test
    public void givenEmpty_returnsAllZeros() {
        Scoring scoring = new Scoring();
        int [] allZeros = scoring.calculateScores("");
        assertArrayEquals(new int[3],allZeros);
    }

    @Test
    public void givenA_returnsOneZeroZero() {
        Scoring scoring = new Scoring();
        int[] onlyAScores = scoring.calculateScores("A");
        assertArrayEquals(new int[] {1,0,0}, onlyAScores);
    }

    @Test
    public void givenB_returnsZeroOneZero() {
        Scoring scoring = new Scoring();
        int[] onlyBScores = scoring.calculateScores("B");
        assertArrayEquals(new int[] {0,1,0}, onlyBScores);
    }

    @Test
    public void givenC_returnsZeroZeroOne() {
        Scoring scoring = new Scoring();
        int[] onlyCScores = scoring.calculateScores("C");
        assertArrayEquals(new int[] {0,0,1}, onlyCScores);
    }
}
