package org.example.ch6;

import java.util.function.Supplier;

public class StackUtils {
    public static <E> void reverse(E[] a, Supplier<Stack<E>> stackFactory) {
        Stack<E> buffer = stackFactory.get();
        for (E e : a) buffer.push(e);
        for (int i = 0; i < a.length; i++) a[i] = buffer.pop();
    }
}
