package org.example;

import java.util.ArrayList;

public class ArrayListAdd implements Command {
    private ArrayList list;

    public ArrayListAdd(ArrayList list) {
        this.list = list;
    }

    @Override
    public void execute() {
        list.add(new Object());
    }
}
