package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RockTest {

    Rock rock = new Rock();
    Paper paper = new Paper("paper");
    Scissors scissor = new Scissors("scissors");

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
    void testCrushSuccess() {
        String result = rock.crush(scissor.getName());
        assertEquals(result, "Rock crush Scissors");
    }

    @Test
    void testCrushNoSuccess() {
        String result = rock.crush(paper.getName());
        assertEquals(result, "Rock can't crush paper");
    }

    @Test
    void testCrushWithSameItem() {
        String result = rock.crush(rock.getName());
        assertEquals(result, "Rock VS rock.. Nothing");
    }
}
