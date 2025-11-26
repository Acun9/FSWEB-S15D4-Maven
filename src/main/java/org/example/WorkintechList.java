package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<String> {

    @Override
    public boolean add(String s) {
        if (this.contains(s)) return false;
        return super.add(s);
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        // after removal, sort the list
        try {
            Collections.sort(this);
        } catch (Exception ignored) {}
        return removed;
    }
}

