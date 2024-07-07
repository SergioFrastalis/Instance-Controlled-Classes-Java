package gr.aueb.cf.ch14.homework;

import java.util.Stack;

public class StackManager {
    private static final StackManager INSTANCE = new StackManager();
    private static final int MAX_SIZE = 5;  // Define the max size of the stack
    private final Stack<Integer> stack;

    private StackManager() {
        stack = new Stack<>();
    }

    public static StackManager getInstance() {
        return INSTANCE;
    }

    public void push(int value) {
        if (!isFull()) {
            stack.push(value);
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public Integer pop() {
        if (!isEmpty()) {
            Integer value = stack.pop();
            System.out.println("Popped: " + value);
            return value;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
    }

    public boolean isFull() {
        return stack.size() == MAX_SIZE;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
