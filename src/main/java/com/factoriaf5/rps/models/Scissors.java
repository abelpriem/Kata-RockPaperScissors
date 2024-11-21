package com.factoriaf5.rps.models;

import com.factoriaf5.rps.application.Sheldon;

public class Scissors implements Sheldon {
    public String name;

    public Scissors(String name) {
        this.name = name;
    }

    public Scissors() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String cut(String name) {
        if (name == "paper") {
            return "Scissors cuts Paper";
        }

        return null;
    }

    public String decapitates(String name) {
        if (name == "lizard") {
            return "Scissors decapitates Lizard";
        }

        return null;
    }

    @Override
    public String play(String name) {
        String result;

        if (name.equals("paper")) {
            result = cut("paper");
        } else if (name.equals("lizard")) {
            result = decapitates("lizard");
        } else {
            result = "Scissors can't cut or decapitates " + name;
        }

        return result;
    }
}
