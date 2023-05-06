package org.example;

import java.util.ArrayList;

public class ArrayListRemoveObject implements Command {
    private ArrayList list;

    public ArrayListRemoveObject() {
        list = new ArrayList();
        for (int i = 0; i < 15000; i++) {
            list.add(new Object());
        }
    }

    @Override
    public void execute() {
        list.remove(new Object());
    }
}
