package org.example;

import java.util.LinkedList;

public class LinkedListRemoveIndex implements Command {
    private LinkedList list;

    public LinkedListRemoveIndex() {
        list = new LinkedList();
        for (int i = 0; i < 15000; i++) {
            list.add(new Object());
        }
    }

    @Override
    public void execute() {
        list.remove(2);
    }
}
