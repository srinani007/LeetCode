package Stack;

import java.util.Stack;

public class Balanced {
    public static void main(String[] args) {
        String str = "({[]})";
        System.out.println(isBalanced(str));
    }

    private static Boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
