package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LizardTest {

    Lizard lizard = new Lizard();
    Paper paper = new Paper("paper");
    Spock spock = new Spock("spock");
    Rock rock = new Rock("rock");

    @Test
    void testSetter() {
        lizard.setName("lizard");
        assertEquals(lizard.getName(), "lizard");
    }

    @Test
    void testGetter() {
        lizard.setName("lizard");
        String name = lizard.getName();

        assertEquals(name, "lizard");
    }

    @Test
    void testPlaysWithEats() {
        String result = lizard.play(paper.getName());
        assertEquals(result, "Lizard eats Paper");
    }

    @Test
    void testPlaysWithNullInEats() {
        String result = lizard.eats(rock.getName());
        assertEquals(result, null);
    }

    @Test
    void testPlaysWithPoisons() {
        String result = lizard.play(spock.getName());
        assertEquals(result, "Lizard poisons Spock");
    }

    @Test
    void testPlaysWithNullInPoisons() {
        String result = lizard.poisons(rock.getName());
        assertEquals(result, null);
    }

    @Test
    void testPlaysWithOther() {
        String result = lizard.play(rock.getName());
        assertEquals(result, "Lizard can't eat or poison " + rock.getName());
    }
}
