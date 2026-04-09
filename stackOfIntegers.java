// Write a class named StackOfIntegers that implements a stack of integers using an array. The class should have the following methods:
// - push(int value): Adds an integer to the top of the stack.
// - peek(): Returns the integer at the top of the stack without removing it.
public class stackOfIntegers {
    private int[] elements;
    private int size;
    
    public stackOfIntegers(int capacity) {
        elements = new int[capacity];
        size = 0;
    }
    
    public void push(int value) {
        if (size < elements.length) {
            elements[size] = value;
            size++;
        }
    }
    
    public int peek() {
        if (size > 0) {
            return elements[size - 1];
        }
        return -1;
    }
    
    public static void main(String[] args) {
        stackOfIntegers stack = new stackOfIntegers(10); // create a new stack with size 10
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println("Top element: " + stack.peek()); // should print 10
    
    }
}
