package com.codecool.hanger.api;

import com.codecool.hanger.api.exceptions.WrongClothException;

public class ShirtHanger extends Hanger {
    public ShirtHanger(String name) {
        super(name);
    }

    @Override
    void addToHanger(Clothes clothes) throws WrongClothException {
        if(clothes instanceof Shirt) {
            getClothes().add(clothes);
            setShirtsOnHanger(getShirtsOnHanger() + 1);
        }
        else{
            throw new WrongClothException();
        }
    }
}
