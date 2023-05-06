package org.example;

import java.util.LinkedList;

public class LinkedListRemoveObject implements Command {
    private LinkedList list;

    public LinkedListRemoveObject() {
        list = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
    }

    @Override
    public void execute() {
        list.remove(new Object());
    }
}
