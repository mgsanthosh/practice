package Competitive;

import java.util.*;
import java.util.regex.Pattern;


public class ValidParentheses {

    static boolean checkParanthesis(String str) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        char[] bracket = str.toCharArray();
        for (int i = 0;i<bracket.length;i++) {
            char currentChar = bracket[i];
            if((currentChar == ')' || currentChar == ']' || currentChar == '}') && !stack.isEmpty()) {
                if(stack.peek() != map.get(currentChar)) {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(currentChar);
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "(){}[]{";
        if(checkParanthesis(str)){
            System.out.println("VALID");
        } else {
            System.out.println("NOT VALID");

        }
    }
}
