import java.util.*;
class Solution {
    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='(')
                stack.push(s.charAt(i));
            else {
                if(!stack.isEmpty()) 
                    stack.pop();
                else 
                    return false;
            }
        }
        
        if(!stack.isEmpty())
            return false;

        return true;
    }
}