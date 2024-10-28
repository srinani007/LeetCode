package Stack;

import java.util.Stack;

public class ReverseStack {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public String reverse(String s) {
        Stack<Character> stack = new Stack();
            for(char c : s.toCharArray()) {
                stack.push(c);
            }
            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.toString();
        }
    public static void main(String[] args){
        ReverseStack reverseStack = new ReverseStack();
        String str = "HELLO PRASANTH";
        System.out.println("Reverse : "+reverseStack.reverse(str));
    }
}

