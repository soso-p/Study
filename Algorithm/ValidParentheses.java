import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        int len = s.length();
        for (int i=0;i<len;i++) {
            if (s.substring(i, i+1).equals("(")||s.substring(i, i+1).equals("{")||s.substring(i, i+1).equals("[")) {
            stack.push(s.substring(i, i+1));
            }
            else if (s.substring(i, i+1).equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                }
                String s2 = stack.pop();
                if (!s2.equals("(")) {
                    return false;
                }
            }
            else if (s.substring(i, i+1).equals("}")) {
                if (stack.isEmpty()) {
                    return false;
                }
                String s2 = stack.pop();
                if (!s2.equals("{")) {
                    return false;
                }
            }
            else if (s.substring(i, i+1).equals("]")) {
                if (stack.isEmpty()) {
                    return false;
                }
                String s2 = stack.pop();
                if (!s2.equals("[")) {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
