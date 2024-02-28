//todo: https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String expr = "([{}])";
        String expr1 = "(){}[]";
        String expr2 = "({})[]";

        System.out.println(isValid(expr));
        System.out.println(isValid(expr1));
        System.out.println(isValid(expr2));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }
}
