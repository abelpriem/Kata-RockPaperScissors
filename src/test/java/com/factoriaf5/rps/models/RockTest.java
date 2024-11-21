package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RockTest {

    Rock rock = new Rock();
    Scissors scissor = new Scissors("scissors");
    Lizard lizard = new Lizard("lizard");
    Paper paper = new Paper("paper");

    @Test
    void testSetter() {
        rock.setName("rock");
        assertEquals(rock.getName(), "rock");
    }

    @Test
    void testGetter() {
        rock.setName("rock");
        String result = rock.getName();

        assertEquals(result, "rock");
    }

    @Test
    void testPlaysWithLizard() {
        String result = rock.play(lizard.getName());
        assertEquals(result, "Rock crush Lizard");
    }

    @Test
    void testPlaysWithScissors() {
        String result = rock.play(scissor.getName());
        assertEquals(result, "Rock crush Scissors");
    }

    @Test
    void testPlayWithOther() {
        String result = rock.play(paper.getName());
        assertEquals(result, "Rock can't crush " + paper.getName());
    }
}
