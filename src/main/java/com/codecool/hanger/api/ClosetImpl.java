package com.codecool.hanger.api;

import com.codecool.hanger.api.exceptions.NoSuchHangerException;

import java.util.ArrayList;
import java.util.List;

public class ClosetImpl implements Closet {

    private String name;
    private List<Hanger> hangers;

    public ClosetImpl(String name) {
        hangers = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void addToCloset(Hanger hanger) {
        hangers.add(hanger);
    }

    @Override
    public void removeFromCloset(String hangerName) {
        for (Hanger hanger:hangers) {
            if(hanger.getName().equals(hangerName)){
                hangers.remove(hanger);
                break;
            }
        }
    }

    @Override
    public Hanger getHangerByName(String hangerName) throws NoSuchHangerException {
        for (Hanger hanger:hangers) {
            if(hanger.getName().equals(hangerName)){
                return hanger;
            }
        }
        throw new NoSuchHangerException();
    }

    public String getName() {
        return name;
    }
    public List<Hanger> getHangers() {
        return hangers;
    }
}
