package com.mattring.datastructures;

public interface MiniSet<T> {
    boolean add(T itemToAdd);
    boolean contains(T itemToCheck);
    Iterable<T> asIterable();
}
