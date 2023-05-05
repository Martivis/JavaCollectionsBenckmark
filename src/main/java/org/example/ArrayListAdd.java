package org.example;

import java.util.ArrayList;

public class ArrayListAdd implements Command {
    private ArrayList list;

    public ArrayListAdd() {
        this.list = new ArrayList();
    }

    @Override
    public void execute() {
        list.add(new Object());
    }
}
