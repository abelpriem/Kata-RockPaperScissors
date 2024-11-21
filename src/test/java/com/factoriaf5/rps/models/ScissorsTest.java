package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ScissorsTest {

    Scissors scissors = new Scissors();
    Paper paper = new Paper("paper");
    Lizard lizard = new Lizard("lizard");
    Rock rock = new Rock("rock");

    @Test
    void testSetter() {
        scissors.setName("scissors");
        assertEquals(scissors.getName(), "scissors");
    }

    @Test
    void testGetter() {
        scissors.setName("scissors");
        String result = scissors.getName();

        assertEquals(result, "scissors");
    }

    @Test
    void testPlaysWithCut() {
        String result = scissors.play(paper.getName());
        assertEquals(result, "Scissors cuts Paper");
    }

    @Test
    void testPlaysWithNullInCut() {
        String result = scissors.cut(rock.getName());
        assertEquals(result, null);
    }

    @Test
    void testPlaysWithDecapitates() {
        String result = scissors.play(lizard.getName());
        assertEquals(result, "Scissors decapitates Lizard");
    }

    @Test
    void testPlaysWithNullInDecapitates() {
        String result = scissors.decapitates(rock.getName());
        assertEquals(result, null);
    }

    @Test
    void testPlaysWithOthers() {
        String result = scissors.play(rock.getName());
        assertEquals(result, "Scissors can't cut or decapitates " + rock.getName());
    }
}
