package org.example;

import java.util.LinkedList;

public class LinkedListAdd implements Command {
    private LinkedList list;

    public LinkedListAdd() {
        this.list = new LinkedList();
    }

    @Override
    public void execute() {
        list.add(new Object());
    }
}
