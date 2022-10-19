package com.mattring.datastructures.impl;

import com.mattring.datastructures.MiniList;
import com.mattring.datastructures.MiniSet;

public class LinkedMiniSet<T> implements MiniSet<T> {
    private final MiniList<T> innerList = new LinkedMiniList<>();

    @Override
    public boolean add(T itemToAdd) {
        final boolean contains = contains(itemToAdd);
        if (!contains) {
            innerList.add(itemToAdd);
        }
        return contains;
    }

    @Override
    public boolean contains(T itemToCheck) {
        boolean contains = false;
        for (T item : innerList.asIterable()) {
            if (item.equals(itemToCheck)) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    @Override
    public Iterable<T> asIterable() {
        return innerList.asIterable();
    }
}
