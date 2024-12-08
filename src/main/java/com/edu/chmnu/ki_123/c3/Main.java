package com.edu.chmnu.ki_123.c3;

public class Main {
    public static void main(String[] args) {
        StackMain<Integer> stack = new StackMain<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is empty: " + stack.isEmpty());
    }
}