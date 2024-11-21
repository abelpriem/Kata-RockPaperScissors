package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PaperTest {

    Paper paper = new Paper();
    Spock spock = new Spock("spock");
    Rock rock = new Rock("rock");
    Scissors scissors = new Scissors("scissors");

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
    void testPlaysWithCovers() {
        String result = paper.play(rock.getName());
        assertEquals(result, "Paper covers Rock");
    }

    @Test
    void testPlaysWithNullInCovers() {
        String result = paper.covers("lizard");
        assertEquals(result, null);
    }

    @Test
    void testPlaysWithDisproves() {
        String result = paper.play(spock.getName());
        assertEquals(result, "Paper disproves Spock");
    }

    @Test
    void testPlaysWithNullInDisproves() {
        String result = paper.disproves("rock");
        assertEquals(result, null);
    }

    @Test
    void testPlaysWithOther() {
        String result = paper.play(scissors.getName());
        assertEquals(result, "Paper can't cover or disproves " + scissors.getName());
    }
}
