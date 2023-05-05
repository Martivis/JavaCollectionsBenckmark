package org.example;

import java.util.LinkedList;

public class LinkedListAdd implements Command {
    private LinkedList list;

    public LinkedListAdd(LinkedList list) {
        this.list = list;
    }

    @Override
    public void execute() {
        list.add(new Object());
    }
}
