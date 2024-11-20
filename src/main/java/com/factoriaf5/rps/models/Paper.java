package com.factoriaf5.rps.models;

public class Paper {
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
        } else if (name == this.name) {
            return "Paper VS paper.. Nothing";
        }

        return "Paper can't cover " + name;
    }
}
