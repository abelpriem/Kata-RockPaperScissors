package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PaperTest {

    Paper paper = new Paper();
    Rock rock = new Rock("rock");
    Scissors scissor = new Scissors("scissors");

    @Test
    void testSetter() {
        paper.setName("paper");
        assertEquals(paper.getName(), "paper");
    }

    @Test
    void testGetter() {
        paper.setName("paper");
        String result = paper.getName();

        assertEquals(result, "paper");
    }

    @Test
    void testCoversSuccess() {
        String result = paper.covers(rock.getName());
        assertEquals(result, "Paper covers Rock");
    }

    @Test
    void testCoversNoSuccess() {
        String result = paper.covers(scissor.getName());
        assertEquals(result, "Paper can't cover scissors");
    }

    @Test
    void testCoversWithSameItem() {
        String result = paper.covers(paper.getName());
        assertEquals(result, "Paper VS paper.. Nothing");
    }
}
