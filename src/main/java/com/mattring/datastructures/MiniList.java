package com.mattring.datastructures;

public interface MiniList<T> {
    void add(T itemToAdd);
    Iterable<T> asIterable();
}
