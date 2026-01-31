package org.example.ch3;

public interface LinkedList<E> {

    int size();

    boolean isEmpty();

    E fist();

    E last();

    void addFirst(E e);

    void addLast(E e);

    E removeFirst();

    E removeLast();

    void print();
}
