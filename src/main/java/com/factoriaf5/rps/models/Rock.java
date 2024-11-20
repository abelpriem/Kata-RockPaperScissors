package com.factoriaf5.rps.models;

public class Rock {
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
        } else if (name == this.name) {
            return "Rock VS rock.. Nothing";
        }

        return "Rock can't crush " + name;
    }
}
