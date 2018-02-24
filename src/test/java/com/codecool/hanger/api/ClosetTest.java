package com.codecool.hanger.api;

import com.codecool.hanger.api.exceptions.NoSuchHangerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClosetTest {
    @Test
    void testInstances(){
        Closet closet = new ClosetImpl("Closet");
        Hanger pantsHanger = new PantsHanger("Pants");
        Hanger shirtsHanger = new ShirtHanger("Shirts");
        closet.addToCloset(pantsHanger);
        closet.addToCloset(shirtsHanger);
        assertEquals(pantsHanger.getName(),closet.getHangers().get(0).getName());
        assertEquals(shirtsHanger.getName(),closet.getHangers().get(1).getName());
    }
    @Test
    void testRemove(){
        Closet closet = new ClosetImpl("Closet");
        Hanger pantsHanger = new PantsHanger("Pants");
        closet.addToCloset(pantsHanger);
        assertEquals(1,closet.getHangers().size());
        closet.removeFromCloset("Pants");
        assertEquals(0,closet.getHangers().size());
    }
    @Test
    void testBadHangerName(){
        Closet closet = new ClosetImpl("Closet");
        Hanger pantsHanger = new PantsHanger("Pants");
        closet.addToCloset(pantsHanger);

        Throwable exception = assertThrows(NoSuchHangerException.class,
                ()->{closet.getHangerByName("HEHE");} );
    }
}