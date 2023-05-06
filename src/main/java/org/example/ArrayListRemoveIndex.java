package org.example;

import java.util.ArrayList;

public class ArrayListRemoveIndex implements Command {
    private ArrayList list;

    public ArrayListRemoveIndex() {
        list = new ArrayList();
        for (int i = 0; i < 15000; i++) {
            list.add(new Object());
        }
    }

    @Override
    public void execute() {
        list.remove(2);
    }
}
