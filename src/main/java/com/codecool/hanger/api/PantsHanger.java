package com.codecool.hanger.api;

public class PantsHanger extends Hanger {
    public PantsHanger(String name) {
        super(name);
    }

    @Override
    void addToHanger(Clothes clothes) {
        getClothes().add(clothes);
        setPantsOnHanger(getPantsOnHanger()+1);
    }

}
