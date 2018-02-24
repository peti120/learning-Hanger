package com.codecool.hanger.api;

import com.codecool.hanger.api.exceptions.NoSuchHangerException;

import java.util.List;

public interface Closet {
    void addToCloset(Hanger hanger);
    void removeFromCloset(String hangerName);
    Hanger getHangerByName(String hangerName) throws NoSuchHangerException;
    List<Hanger> getHangers();

}
