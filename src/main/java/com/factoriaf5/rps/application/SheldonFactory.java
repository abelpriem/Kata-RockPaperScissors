package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class SheldonFactory {
    public static Sheldon playSheldon(String type) {
        switch (type) {
            case "paper":
                return new Paper("paper");
            case "rock":
                return new Rock("rock");
            case "scissors":
                return new Scissors("scissors");
            case "lizard":
                return new Lizard("lizard");
            case "spock":
                return new Spock("spock");
            default:
                throw new IllegalArgumentException("Unknown game type");
        }
    }
}
