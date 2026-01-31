package org.example.ch6;

public class ArrayStack<E> implements Stack<E> {

    public static final int CAPACITY = 1000;

    private E[] data;

    private int courser = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return courser + 1;
    }

    @Override
    public boolean isEmpty() {
        return courser == -1;
    }

    @Override
    public void push(E e) {
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[++courser] = e;
    }

    @Override
    public E top() {
        if (isEmpty()) return null;
        return data[courser];
    }

    @Override
    public E pop() {
        if (isEmpty( )) return null;
        E answer = data[courser];
        data[courser] = null;
        courser--;
        return answer;
    }
}
