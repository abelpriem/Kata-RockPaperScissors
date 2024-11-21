package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SpockTest {
    Spock spock = new Spock();
    Scissors scissors = new Scissors("scissors");
    Rock rock = new Rock("rock");
    Lizard lizard = new Lizard("lizard");

    @Test
    void testSetter() {
        spock.setName("spock");
        assertEquals(spock.getName(), "spock");
    }

    @Test
    void testGetter() {
        spock.setName("spock");
        String name = spock.getName();

        assertEquals(name, "spock");
    }

    @Test
    void testPlaysWithSmashes() {
        String result = spock.play(scissors.getName());
        assertEquals(result, "Spock smashes Scissors");
    }

    @Test
    void testPlaysWithNullInSmashes() {
        String result = spock.smashes(lizard.getName());
        assertEquals(result, null);
    }

    @Test
    void testPlaysWithVaporizes() {
        String result = spock.play(rock.getName());
        assertEquals(result, "Spock vaporizes Rock");
    }

    @Test
    void testPlaysWithNullInVaporizes() {
        String result = spock.vaporizes(lizard.getName());
        assertEquals(result, null);
    }

    @Test
    void testPlaysWithOthers() {
        String result = spock.play(lizard.getName());
        assertEquals(result, "Spock can't smashes or vaporizes " + lizard.getName());
    }

}
