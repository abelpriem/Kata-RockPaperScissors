package com.factoriaf5.rps.models;

import com.factoriaf5.rps.application.Sheldon;

public class Spock implements Sheldon {
    public String name;

    public Spock(String name) {
        this.name = name;
    }

    public Spock() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String smashes(String name) {
        if (name == "scissors") {
            return "Spock smashes Scissors";
        }

        return null;
    }

    public String vaporizes(String name) {
        if (name == "rock") {
            return "Spock vaporizes Rock";
        }

        return null;
    }

    @Override
    public String play(String name) {
        String result;

        if (name.equals("scissors")) {
            result = smashes("scissors");
        } else if (name.equals("rock")) {
            result = vaporizes("rock");
        } else {
            result = "Spock can't smashes or vaporizes " + name;
        }

        return result;
    }
}
