package com.factoriaf5.rps.models;

public class Scissors {
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
        } else if (name == this.name) {
            return "Scissors VS Scissors... Nothing";
        }

        return "Scissors can't cut " + name;
    }
}
