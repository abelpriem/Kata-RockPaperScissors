package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ScissorsTest {

    Paper paper = new Paper("paper");
    Rock rock = new Rock("rock");
    Scissors scissors = new Scissors();

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
    void testCutSuccess() {
        String result = scissors.cut(paper.getName());
        assertEquals(result, "Scissors cuts Paper");
    }

    @Test
    void testCoversNoSuccess() {
        String result = scissors.cut(rock.getName());
        assertEquals(result, "Scissors can't cut rock");
    }

    @Test
    void testCoversWithSameItem() {
        String result = scissors.cut(scissors.getName());
        assertEquals(result, "Scissors VS Scissors... Nothing");
    }
}
