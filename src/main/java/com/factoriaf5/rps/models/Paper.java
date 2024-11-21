package com.factoriaf5.rps.models;

import com.factoriaf5.rps.application.Sheldon;

public class Paper implements Sheldon {
    public String name;

    public Paper(String name) {
        this.name = name;
    }

    public Paper() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String covers(String name) {
        if (name == "rock") {
            return "Paper covers Rock";
        }

        return null;
    }

    public String disproves(String name) {
        if (name == "spock") {
            return "Paper disproves Spock";
        }

        return null;
    }

    @Override
    public String play(String name) {
        String result;

        if (name.equals("rock")) {
            result = covers("rock");
        } else if (name.equals("spock")) {
            result = disproves("spock");
        } else {
            result = "Paper can't cover or disproves " + name;
        }

        return result;
    }
}
