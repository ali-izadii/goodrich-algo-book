package org.example.ch3;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> s = new SinglyLinkedList<>();
        s.addFirst("a");
        s.removeLast();
        s.print();
    }
}
