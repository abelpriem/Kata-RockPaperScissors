package com.factoriaf5.rps.models;

import com.factoriaf5.rps.application.Sheldon;

public class Lizard implements Sheldon {
    public String name;

    public Lizard(String name) {
        this.name = name;
    }

    public Lizard() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String eats(String name) {
        if (name == "paper") {
            return "Lizard eats Paper";
        }

        return null;
    }

    public String poisons(String name) {
        if (name == "spock") {
            return "Lizard poisons Spock";
        }

        return null;
    }

    @Override
    public String play(String name) {
        String result;

        if (name.equals("paper")) {
            result = eats("paper");
        } else if (name.equals("spock")) {
            result = poisons("spock");
        } else {
            result = "Lizard can't eat or poison " + name;
        }

        return result;
    }
}
