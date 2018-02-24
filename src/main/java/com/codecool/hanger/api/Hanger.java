package com.codecool.hanger.api;

public abstract class Hanger {
    private String name;

    public Hanger(String name) {
        this.name = name;
    }

    abstract void addToHanger(Clothes clothes);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
