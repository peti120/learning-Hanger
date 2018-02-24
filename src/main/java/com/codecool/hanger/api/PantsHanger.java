package com.codecool.hanger.api;

import com.codecool.hanger.api.exceptions.WrongClothException;

public class PantsHanger extends Hanger {
    public PantsHanger(String name) {
        super(name);
    }

    @Override
    void addToHanger(Clothes clothes) throws WrongClothException {
        if(clothes instanceof Pant) {
            getClothes().add(clothes);
            setPantsOnHanger(getPantsOnHanger() + 1);
        }
        else{
            throw new WrongClothException();
        }
    }

}
