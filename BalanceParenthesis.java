import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    // Helper method to check if two characters are matching brackets
    private boolean matching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            // Push the opening brackets onto the stack
            if (x == '(' || x == '{' || x == '[') {
                stack.push(x);
            } else {
                // If stack is empty, there is no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                // If the top of the stack doesn't match the closing bracket, return false
                if (!matching(stack.peek(), x)) {
                    return false;
                }
                // Pop the matching opening bracket
                stack.pop();
            }
        }
        // If stack is empty, all brackets are matched correctly
        return stack.isEmpty();
    }
}
