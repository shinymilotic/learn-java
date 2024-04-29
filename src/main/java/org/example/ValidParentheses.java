import java.io.*;
import java.util.*;
 

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int sLen = s.length();

        for (int i = 0; i < sLen; i++) {

            if (!stack.isEmpty() &&
             isValidParenthesis(stack.peek(), s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.empty()) {
            return true;
        }

        return false;
    }

    public boolean isValidParenthesis(Character open, Character close) {
        if (open.equals('[') && close.equals(']') ||
            open.equals('{') && close.equals('}') ||
            open.equals('(') && close.equals(')')) {
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ValidParentheses algo = new ValidParentheses();
        algo.isValid("()[]{}");
    }
}
