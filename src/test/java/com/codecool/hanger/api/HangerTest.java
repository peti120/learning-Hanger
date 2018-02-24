package com.codecool.hanger.api;

import com.codecool.hanger.api.exceptions.WrongClothException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HangerTest {
    @Test
    void testPantsHanger() throws WrongClothException {
        Hanger pantsHanger = new PantsHanger("Pants");
        Clothes pant = new Pant("TestPant");
        pantsHanger.addToHanger(pant);
        assertEquals(1,pantsHanger.getPantsOnHanger());

    }
    @Test
    void testWrongClothes() throws WrongClothException {
        Hanger pantsHanger = new PantsHanger("Pants");
        Clothes shirt = new Shirt("TestShirt");
        Clothes pant = new Pant("TestPant");
        Throwable exception = assertThrows(WrongClothException.class,
                ()->{pantsHanger.addToHanger(shirt);} );
    }

}