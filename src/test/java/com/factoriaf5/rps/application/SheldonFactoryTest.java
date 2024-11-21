package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class SheldonFactoryTest {

    @Test
    void testFactoryPaperWithCovers() {
        Paper paper = (Paper) SheldonFactory.playSheldon("paper");
        Rock rock = (Rock) SheldonFactory.playSheldon("rock");

        String result = paper.play(rock.getName());
        assertEquals(result, "Paper covers Rock");
    }

    @Test
    void testFactoryPaperWithDisproves() {
        Paper paper = (Paper) SheldonFactory.playSheldon("paper");
        Spock spock = (Spock) SheldonFactory.playSheldon("spock");

        String result = paper.play(spock.getName());
        assertEquals(result, "Paper disproves Spock");
    }

    @Test
    void testFactoryRockOnCrushWithLizard() {
        Rock rock = (Rock) SheldonFactory.playSheldon("rock");
        Lizard lizard = (Lizard) SheldonFactory.playSheldon("lizard");

        String result = rock.play(lizard.getName());
        assertEquals(result, "Rock crush Lizard");
    }

    @Test
    void testFactoryRockOnCrushWithScissors() {
        Rock rock = (Rock) SheldonFactory.playSheldon("rock");
        Scissors scissors = (Scissors) SheldonFactory.playSheldon("scissors");

        String result = rock.play(scissors.getName());
        assertEquals(result, "Rock crush Scissors");
    }

    @Test
    void testFactoryScissorsWithCut() {
        Scissors scissors = (Scissors) SheldonFactory.playSheldon("scissors");
        Paper paper = (Paper) SheldonFactory.playSheldon("paper");

        String result = scissors.play(paper.getName());
        assertEquals(result, "Scissors cuts Paper");
    }

    @Test
    void testFactoryScissorsWithDecapitates() {
        Scissors scissors = (Scissors) SheldonFactory.playSheldon("scissors");
        Lizard lizard = (Lizard) SheldonFactory.playSheldon("lizard");

        String result = scissors.play(lizard.getName());
        assertEquals(result, "Scissors decapitates Lizard");
    }

    @Test
    void testFactoryLizardWithEats() {
        Lizard lizard = (Lizard) SheldonFactory.playSheldon("lizard");
        Paper paper = (Paper) SheldonFactory.playSheldon("paper");

        String result = lizard.play(paper.getName());
        assertEquals(result, "Lizard eats Paper");
    }

    @Test
    void testFactoryLizardWithPoison() {
        Lizard lizard = (Lizard) SheldonFactory.playSheldon("lizard");
        Spock spock = (Spock) SheldonFactory.playSheldon("spock");

        String result = lizard.play(spock.getName());
        assertEquals(result, "Lizard poisons Spock");
    }

    @Test
    void testFactorySpockWithSmashes() {
        Spock spock = (Spock) SheldonFactory.playSheldon("spock");
        Scissors scissors = (Scissors) SheldonFactory.playSheldon("scissors");

        String result = spock.play(scissors.getName());
        assertEquals(result, "Spock smashes Scissors");
    }

    @Test
    void testFactorySpockWithVaporizes() {
        Spock spock = (Spock) SheldonFactory.playSheldon("spock");
        Rock rock = (Rock) SheldonFactory.playSheldon("rock");

        String result = spock.play(rock.getName());
        assertEquals(result, "Spock vaporizes Rock");
    }

    @Test
    void testFactoryWithOtherGame() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            SheldonFactory.playSheldon("bird");
        });

        assertEquals("Unknown game type", exception.getMessage());
    }
}
