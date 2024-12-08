package com.edu.chmnu.ki_123.c3;

public class StackMain<E> implements Stack<E> {
    private final DynamicArray dynamicArray = new DynamicArray();

    @Override
    public void push(E element) {
        dynamicArray.add(element);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        return dynamicArray.remove(dynamicArray.size() - 1);
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return dynamicArray.get(dynamicArray.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return dynamicArray.size() == 0;
    }

    @Override
    public int size() {
        return dynamicArray.size();
    }

    private class DynamicArray {
        private Object[] elements = new Object[10];
        private int size = 0;

        public void add(E element) {
            if (size == elements.length) {
                resize();
            }
            elements[size++] = element;
        }

        public E remove(int index) {
            checkIndex(index);
            E element = get(index);
            elements[index] = elements[--size];
            elements[size] = null;
            return element;
        }

        public E get(int index) {
            checkIndex(index);
            return cast(elements[index]);
        }

        public int size() {
            return size;
        }

        private void resize() {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }

        private void checkIndex(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Noncorrect index: " + index);
            }
        }

        private E cast(Object obj) {
            try {
                return (E) obj;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Error type", e);
            }
        }
    }
}
