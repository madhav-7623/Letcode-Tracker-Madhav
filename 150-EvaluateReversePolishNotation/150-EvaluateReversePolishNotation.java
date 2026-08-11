// Last updated: 11/08/2026, 21:06:47
import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String t : tokens) {

            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                switch (t) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }

            } else {
                stack.push(Integer.parseInt(t));
            }
        }

        return stack.pop();
    }
}