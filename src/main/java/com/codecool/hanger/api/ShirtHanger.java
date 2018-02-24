package com.codecool.hanger.api;

public class ShirtHanger extends Hanger {
    public ShirtHanger(String name) {
        super(name);
    }

    @Override
    void addToHanger(Clothes clothes) {
        getClothes().add(clothes);
        setShirtsOnHanger(getShirtsOnHanger()+1);
    }
}
