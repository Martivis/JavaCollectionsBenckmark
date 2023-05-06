package org.example;

import java.util.LinkedList;

public class LinkedListGet implements Command {
    private LinkedList list;

    public LinkedListGet() {
        list = new LinkedList();
        for (int i = 0; i < 15000; i++) {
            list.add(new Object());
        }
    }

    @Override
    public void execute() {
        list.get(5000);
    }
}
