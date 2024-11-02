package Stack;
import java.util.Stack;

public class MinStack{
    private Stack<Integer> mainStack();
    private Stack<Integer> minStack();

    /** Initialize your data structure here. */
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int val) {
        mainStack.push(val);
        // Push onto minStack if it's empty or the new element is smaller or equal to the current minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    /** Removes the element on the top of the stack. */
    public void pop() {
        // If the popped element is the current minimum, pop it from the minStack as well
        if(mainStack.isEmpty()){
            return; // Return if the stack is empty
        }
        int popped = mainStack.pop();
        // If the popped element is the minimum, pop it from the minStack as well
        if (popped == minStack.peek()) {
            minStack.pop();
        }
    }
    /** Get the top element. */
    public int top() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return mainStack.peek();
    }
   /** Get the minimum element. */
    public int getMin() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return minStack.peek();
    }
}