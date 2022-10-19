package com.mattring.datastructures.impl;

import com.mattring.datastructures.MiniList;

import java.util.Iterator;

public class LinkedMiniList<T> implements MiniList<T> {
    private static class Item<T> {
        T target;
        Item<T> next;
        public Item(T target) {
            this.target = target;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "target=" + target +
                    ", next=" + next +
                    '}';
        }
    }

    private Item<T> rootItem;
    private Item<T> currentItem;

    @Override
    public void add(T itemToAdd) {
        if (rootItem == null) {
            rootItem = new Item<>(itemToAdd);
            currentItem = rootItem;
        } else {
            currentItem.next = new Item<>(itemToAdd);
            currentItem = currentItem.next;
        }
    }

    @Override
    public Iterable<T> asIterable() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    Item<T> currIterItem = rootItem;

                    @Override
                    public boolean hasNext() {
                        return currIterItem != null;
                    }

                    @Override
                    public T next() {
                        Item<T> returnItem = currIterItem;
                        currIterItem = currIterItem.next;
                        return returnItem.target;
                    }
                };
            }
        };
    }
}
