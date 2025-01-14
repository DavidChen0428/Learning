package LeetCode;

import java.util.Stack;

public class No20_Easy {
    // 題目條件 : vaild parentheses
    // 有效括弧代表括弧是有順序的 Ex. {[()]}
    // 括弧是有起始也有結束的 Ex. {}
    // 括弧不可能往外括 Ex.}{ (X)
    // 只有括弧的字串不可能為單數
    public static boolean isValid01(String s) {
        // Create an empty stack to keep track of opening brackets
        Stack<Character> stack = new Stack<Character>();
        
        // Loop through every character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else { // If the character is a closing bracket
                // If the stack is empty, there is no matching opening bracket, so return false
                if (stack.isEmpty()) {
                    return false;
                }
                // Otherwise, get the top of the stack and check if it's the matching opening bracket
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    // If it is, pop the opening bracket from the stack
                    stack.pop();
                } else { // Otherwise, the brackets don't match, so return false
                    return false;
                }
            }
        }
        // If the stack is empty, all opening brackets have been closed, so return true
        // Otherwise, there are unmatched opening brackets, so return false
        return stack.isEmpty();
    }
    public static boolean isValid02(String s) {
        char[] split = s.toCharArray();
        int size = split.length;
        if (size % 2 != 0) {
            return false;
        }
        //Stack<Character> temp = new Stack<>();
        char [] temp = new char[size];
        int i=0;
        for (char c:split) {
            if (c=='('){
                temp[i]=')';
                i++;
            }
            else if(c=='{'){
                temp[i]='}';
                i++;
            }
            else if(c=='[') {
                temp[i]=']';
                i++;
            }
            else {
                if(i!=0 && temp[i-1]==c){
                    i--;
                }
                else{
                    return false;
                }
            }
        }
        if(i==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid01("{[]()}"));
        System.out.println(isValid02("{]"));
    }
}
