package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackMainTest {
    @Test
    void testPushAndSize() {
        StackMain<Integer> stack = new StackMain<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(3, stack.size());
    }

    @Test
    void testPop() {
        StackMain<String> stack = new StackMain<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    void testIsEmpty() {
        StackMain<Double> stack = new StackMain<>();
        assertTrue(stack.isEmpty());

    }

    @Test
    void testPeek() {
        StackMain<Integer> stack = new StackMain<>();
        stack.push(3);
        stack.push(5);
        stack.push(8);
        stack.push(10);
        stack.push(12);
        assertEquals(12, stack.peek());
    }

    @Test
    void testPopFromEmptyStack() {
        StackMain<Integer> stack = new StackMain<>();
        Exception exception = assertThrows(IllegalStateException.class, stack::pop);
        assertEquals("Stack is Empty", exception.getMessage());
    }

    }