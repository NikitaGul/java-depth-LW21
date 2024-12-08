package com.edu.chmnu.ki_123.c3;

public interface Stack<E> {
    void push(E element);
    E pop();
    E peek();
    boolean isEmpty();

    int size();
}
