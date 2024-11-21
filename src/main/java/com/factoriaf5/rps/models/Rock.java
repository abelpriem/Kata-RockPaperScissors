package com.factoriaf5.rps.models;

import com.factoriaf5.rps.application.Sheldon;

public class Rock implements Sheldon {
    public String name;

    public Rock(String name) {
        this.name = name;
    }

    public Rock() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String crush(String name) {
        if (name == "scissors") {
            return "Rock crush Scissors";
        } else if (name == "lizard") {
            return "Rock crush Lizard";
        }

        return "Rock can't crush " + name;
    }

    @Override
    public String play(String name) {
        String result;

        if (name.equals("scissors")) {
            result = crush("scissors");
        } else if (name.equals("lizard")) {
            result = crush("lizard");
        } else {
            result = crush(name);
        }

        return result;
    }
}
