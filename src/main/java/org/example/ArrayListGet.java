package org.example;

import java.util.ArrayList;

public class ArrayListGet implements Command {
    private ArrayList list;

    public ArrayListGet() {
        list = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
    }

    @Override
    public void execute() {
        list.get(5000);
    }
}
