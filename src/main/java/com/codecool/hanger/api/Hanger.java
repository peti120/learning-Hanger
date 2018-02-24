package com.codecool.hanger.api;

import java.util.ArrayList;
import java.util.List;

public abstract class Hanger {
    private String name;
    private List<Clothes> clothes;

    private int pantsOnHanger;
    private int shirtsOnHanger;

    public Hanger(String name) {
        pantsOnHanger = 0;
        shirtsOnHanger = 0;
        this.name = name;
        clothes = new ArrayList<>();
    }

    abstract void addToHanger(Clothes clothes);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Clothes> getClothes() {
        return clothes;
    }

    public int getPantsOnHanger() {
        return pantsOnHanger;
    }
    public int getShirtsOnHanger() {
        return shirtsOnHanger;
    }

    public void setPantsOnHanger(int pantsOnHanger) {
        this.pantsOnHanger = pantsOnHanger;
    }
    public void setShirtsOnHanger(int shirtsOnHanger) {
        this.shirtsOnHanger = shirtsOnHanger;
    }
}
